package rensyuuproject;

public class Sample5_06_01 {

	public static void main(String[] args) {

				
		int hirosa = (int)(Math.random()*5);
		
		if( hirosa ==10 ) {
			
			System.out.println("家賃が60000円以上になります");
			
		}else if(hirosa == 9) {
			
			System.out.println("家賃が55000円以上になります");
			
		}else if(hirosa == 8) {
			
			System.out.println("家賃が50000円以上になります");
			
		}else if(hirosa ==7) {
			
			System.out.println("家賃が45000円以上になります");
			
		}else if(hirosa == 6) {
			
			System.out.println("家賃が40000円以上になります");
		
		}else if(hirosa == 5){
			
			System.out.println("家賃が35000円以上になります");
			
		}else if(hirosa ==4) {
			
			System.out.println("家賃が30000円以上になります");
			
		}else if(hirosa ==3) {
			
			System.out.println("家賃が25000円以上になります");
			
		}else if(hirosa ==2){
			
			System.out.println("家賃が20000円以上になります");
						
		
		}else{
			
			System.out.println("一度ご相談ください");
		}
		
		System.out.println(hirosa);

		

	}

}
