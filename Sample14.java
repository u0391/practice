package rensyuuproject;

import java.util.Scanner;

public class Sample14 {



		//配列の値を表示するshowArrayメソッド
		
		public static void showArray(int[] a) {
			
			for(int i = 0; i<a.length; i++) {
				
				System.out.println("["+a[i]+"}");
			}
			
			System.out.println();
		}
		
		//指定された要素を入れ替えるswapArrayメソッド
		
		public static void swapArray(int[] a, int pos1, int pos2) {
			
			int temp; 
			
			temp =a[pos1];
			
			a[pos1] = a[pos2];
			
			a[pos2] =temp;
			
		}
		
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			
			int[] a = {0,1,2,3,4,5,6,7,8,9};
			
			int pos1,pos2;
			
			showArray(a);
			
			System.out.println("pos1 = ");
			
			pos1 = scn.nextInt();
			
			System.out.println("pos2 =");
			
			pos2= scn.nextInt();
			
			//pos1とpos2を入れ替える
			
			swapArray(a,pos1,pos2);
			
			//入れ替え後の配列を表示する
			
			showArray(a);
		}
		

	}


