package rensyuuproject;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("[y]を入力");
		
		String str = sc.nextLine();
		
		if(str.equals("y")) {
			
			System.out.println("「"+str+"」が正しく入力されました");
						
		}else {
			
			System.out.println("y以外の「"+str+"」が入力されました。");
		}

	}

}
