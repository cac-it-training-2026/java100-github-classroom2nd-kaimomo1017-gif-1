/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		System.out.println("シトロン   >");
		String citoronBuyCountstr = reader.readLine();
		int citoronBuyCount = Integer.parseInt(citoronBuyCountstr);

		System.out.println("ショコラ  >");
		String shokoraBuyCountstr = reader.readLine();
		int shokoraBuyCount = Integer.parseInt(shokoraBuyCountstr);

		System.out.println("ピスターシュ  >");
		String pisustr = reader.readLine();
		int pisuBuyCount = Integer.parseInt(pisustr);
		System.out.println("\nシトロン     " + citoronBuyCount + "個");
		System.out.println("ショコラ     " + shokoraBuyCount + "個");
		System.out.println("ピスターシュ " + pisuBuyCount + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
		int totalBuycount = citoronBuyCount + shokoraBuyCount + pisuBuyCount;
		int totalPrice = 250 * citoronBuyCount + 280 * shokoraBuyCount + 320 * pisuBuyCount;

		System.out.println("\n合計個数  " + totalBuycount + "個");
		System.out.println("合計金額  " + totalPrice + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		sitoronStock = sitoronStock - citoronBuyCount;
		shokoraStock = shokoraStock - shokoraBuyCount;
		pisutashuStock = pisutashuStock - pisuBuyCount;

		System.out.println("\n 本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250・・・残り" + sitoronStock + "個");
		System.out.println("ショコラ      \\280・・・残り" + shokoraStock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisutashuStock + "個");

	}

}
