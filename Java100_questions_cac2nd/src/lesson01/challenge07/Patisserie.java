/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
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
 */

package lesson01.challenge07;

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

	}

}
