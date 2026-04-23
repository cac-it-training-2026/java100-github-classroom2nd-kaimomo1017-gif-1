/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");
		System.out.println("\nたいへんお待たせしました。\n");
		System.out.println("シトラン   \\250");
		System.out.println("ショコラ   \\280");
		System.out.println("ピスターシュ   \\320");

		System.out.println("\n 本日のおすすめです。 \n");
		System.out.println("シトロン     \\250");
		System.out.println("ショコラ     \\280");
		System.out.println("ピスターシュ \\320");
		int sitoronStock = 30;
		int shokoraStock = 30;
		int pisutashuStock = 30;

		System.out.println("\n 本日のおすすめ商品です。\n ");
		System.out.println("シトロン      \\250・・・残り" + sitoronStock + "個");
		System.out.println("ショコラ      \\280・・・残り" + shokoraStock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisutashuStock + "個");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n それぞれ何個ずつ買いますか？(最大30個まで） \n");
		System.out.print("シトロン   >");
		String citoronBuyCountstr = reader.readLine();
		double citoronBuyCount = Double.parseDouble(citoronBuyCountstr);

		System.out.print("ショコラ  >");
		String shokoraBuyCountstr = reader.readLine();
		double shokoraBuyCount = Double.parseDouble(shokoraBuyCountstr);

		System.out.print("ピスターシュ  >");
		String pisustr = reader.readLine();
		double pisuBuyCount = Double.parseDouble(pisustr);
		System.out.println("\nシトロン     " + citoronBuyCount + "個");
		System.out.println("ショコラ     " + shokoraBuyCount + "個");
		System.out.println("ピスターシュ " + pisuBuyCount + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
		double totalBuycount = citoronBuyCount + shokoraBuyCount + pisuBuyCount;
		int totalPrice = (int) (250 * citoronBuyCount + 280 * shokoraBuyCount + 320 * pisuBuyCount);

		System.out.println("\n合計個数  " + totalBuycount + "個");
		System.out.println("合計金額  " + totalPrice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		sitoronStock = (int) (sitoronStock - citoronBuyCount);
		shokoraStock = (int) (shokoraStock - shokoraBuyCount);
		pisutashuStock = (int) (pisutashuStock - pisuBuyCount);

		System.out.println("\n 本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・残り" + sitoronStock + "個");
		System.out.println("ショコラ      \\280・・・残り" + shokoraStock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisutashuStock + "個");

		System.out.println("\n 閉店のお時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n 売上の割合 ");
		System.out.println("売上合計    \\" + totalPrice);
		System.out.println("\n 内訳");
		System.out.println("シトロン   \\" + (int) (250 * citoronBuyCount) + "・・・"
				+ (int) ((250 * citoronBuyCount) / totalPrice * 100) + "%");
		System.out.println("ショコラ   \\" + (int) (280 * shokoraBuyCount) + "・・・"
				+ (int) ((280 * shokoraBuyCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pisuBuyCount) + "・・・"
				+ (int) ((320 * pisuBuyCount) / totalPrice * 100) + "%");

		//Lesson01-09

		int citoronPercent = (int) ((250 * citoronBuyCount) / totalPrice * 100);
		int shokoraPercent = (int) ((280 * shokoraBuyCount) / totalPrice * 100);
		int pisuPercent = (int) ((320 * pisuBuyCount) / totalPrice * 100);

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + totalPrice);
		System.out.println("\n内訳");

		System.out.println("シトロン  \\" + (int) (250 * citoronBuyCount) + "・・・" + citoronPercent + "%");
		System.out.println("ショコラ  \\" + (int) (280 * shokoraBuyCount) + "・・・" + shokoraPercent + "%");
		System.out.println("ピスターシュ \\" + (int) (320 * pisuBuyCount) + "・・・" + pisuPercent + "%");

		System.out.println("\n 明日の三色マカロンの配合率が決まりました！ ");
		System.out.println("シトロンの味   	・・・" + citoronPercent + "%");
		System.out.println("ショコラの味    ・・・" + shokoraPercent + "%");
		System.out.println("ピスターシュの味   ・・・" + pisuPercent + "%");

		System.out.println("\nが楽しめます。");

		System.out.println("\n値段は\\" + ((totalPrice / (totalBuycount)) / 10 * 10 + "です。"));

	}

}
