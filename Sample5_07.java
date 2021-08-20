package rensyuuproject;

public class Sample5_07 {

	public static void main(String[] args) {

		int tyuukan;
		
		int kimatu;
		
		tyuukan=90;
		
		kimatu= 80;
		
		if(tyuukan>=70 && kimatu>=70) {
			
			System.out.println("成績5");
					
		}else if ((tyuukan<50 && kimatu>= 70)||(tyuukan>=70 && kimatu>=50 && kimatu <70)){
			System.out.println("成績4");
			
		}
		
	
	
	}

}
