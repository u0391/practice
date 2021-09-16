package rensyuuproject;

public class Sample12 {

	public static void main(String[] args) {

		String[] fruit = {"リンゴ","バナナ","ミカン","メロン","イチゴ"};
		
		String [][] pet = {
				
				{"いぬ","ねこ","うさぎ","りす","うま"},
				
				{"錦鯛","金魚","メダカ","亀"},
				
				{"インコ","オウム","ハト"},
					
					
				};
				
				//拡張for文で１次元配列の要素を取り出す
				
				for(String f : fruit) {
					
					System.out.println(f+"/t");
				}
				
				System.out.println();
				
				System.out.println();
		
				//拡張for文で２次元配列の要素を取り出す
				
				for(String[] pArray : pet) {
					
					for(String p : pArray) {
						
						System.out.println(p+"/t");
					}
					
					System.out.println();
					
				}
		}
	
	}


