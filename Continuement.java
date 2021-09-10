package rensyuuproject;

public class Continuement {

	public static void main(String[] args) {

		System.out.println("**ループ開始**");
		
		while(true){
		
		int num = (int)(Math.random()*7)+1;
		
		if(num==4) {
			
			System.out.println(num+"が出たので、ループの先頭へ戻ります");
			
			continue;}
		
		System.out.println("ランダム数値="+num);
		
		if(num%2==0) {
			
			System.out.println("４以外の偶数数値が出たので、ループから抜けます！");
			
			break;
		}
		
		System.out.println("**ループ終了**");
	
		
		
	}
	
	}
	
	}


