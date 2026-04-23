/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
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
 */

package lesson01.challenge08;

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
		Double citoronBuyCount = Double.parseDouble(citoronBuyCountstr);

		System.out.print("ショコラ  >");
		String shokoraBuyCountstr = reader.readLine();
		Double shokoraBuyCount = Double.parseDouble(shokoraBuyCountstr);

		System.out.print("ピスターシュ  >");
		String pisustr = reader.readLine();
		Double pisuBuyCount = Double.parseDouble(pisustr);
		System.out.println("\nシトロン     " + citoronBuyCount + "個");
		System.out.println("ショコラ     " + shokoraBuyCount + "個");
		System.out.println("ピスターシュ " + pisuBuyCount + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
		Double totalBuycount = citoronBuyCount + shokoraBuyCount + pisuBuyCount;
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

	}

}
