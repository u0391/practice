package rensyuuproject;

public class Sample7_04 {

	public static void main(String[] args) {


		int test[][];
		
		test = new  int[3][5];
		
		test[0][0] = 64;
		test[0][1] = 72;
		test[0][2] = 48;
		test[0][3] = 58;
		test[0][4] = 79;
		test[1][0] = 60;
		test[1][1] = 55;
		test[1][2] = 58;
		test[1][3] = 63;
		test[1][4] = 83;
		test[2][0] = 73;
		test[2][1] = 70;
		test[2][2] = 83;
		test[2][3] = 60;
		test[2][4] = 62;

		for(int i = 0; i<5; i++) {
			
			System.out.println("受験番号"+(i+1)+"の人の成績");
			
			for(int j=0; j<3; j++) {
			
			String subject = null;
			
			switch(j) {
			
			case 0:
				subject = "英語";
				break;
				
			case 1:
				subject = "数学";
				break;
				
			case 2:
				subject= "国語";
				break;
			}
			
			System.out.println("\t"+subject+test[j][i]+"点");
			
			}
			System.out.println("\n\n");
				
							
			}
		}

}
