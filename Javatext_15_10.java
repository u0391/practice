package rensyuuproject;

public class Javatext_15_10 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		//ここで何らかの時間がかかる処理 
		
		long end = System.currentTimeMillis();
		
		System.out.println("処理にかかった時間は・・・"+(end-start)+"ミリ秒でした");

	}

}
