package rensyuuproject;

public class Sample5_05 {

	public static void main(String[] args) {

		int yachin = 70000;
		
		int hirosa = 6;
		
		if(yachin <60000 && hirosa<10) {
			
			System.out.println("手ごろないい物件が見つかりそうです");
			
		}else if(yachin>=60000 && hirosa<10) {
			
			System.out.println("その家賃ならもっと広い物件があります。");
			
		}else if (yachin<60000 && hirosa>=10) {
			
			System.out.println("そのような条件の良い物件はありません");
			
		}else if(yachin>60000 && hirosa>=10) {
			
			System.out.println("高級感のある物件がありそうです");
			
		}else {
			
			System.out.println("物件なし");
		}

	}

}
