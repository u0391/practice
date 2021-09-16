package rensyuuproject;

import java.util.Scanner;

public class Sample13 {
	
	//台形の面積を求めるdaikeiメソッド
	
	public static double daikei(double joutei, double katei, double takasa) {
		
		double menseki;
		
		menseki = (joutei+katei)*takasa/2.0;
		
		
		return menseki;
	}

	
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		double a,b,c, ans;
		
		//台形の上底、下底、高さを入力する
		
		System.out.println("上底を入力してください=");
		
		a = scn.nextDouble();
		
		System.out.println("下底を入力してください=");
		
		b = scn.nextDouble();
		
		System.out.println("高さを入力してください=");
		
		c = scn.nextDouble();
		
		//daikei関数を呼び出して台形の面積を求める
		
		ans = daikei(a,b,c);
		
		System.out.println("面積＝"+ans);
		

	}

}
