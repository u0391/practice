package rensyuuproject;

public class ValidPlayer {

	public static void main(String[] args) {
		
		boolean tt =isValidPlayerName("0093");

	}
	
	public static boolean isValidPlayerName(String name) {
		
		if (name.length() !=8 ) {
			
			
		
		return false;
	}
		
		char first = name.charAt(0);
		
		if(!(first>= 'A' && first <= 'Z')) {
			
		return false;
		
		}
		
		for(int i = 1; i<8; i++) {
			
			char c =name.charAt(i);
			
			if(!((c>='A' && c<= 'Z')||(c>='0' && c<='9'))) {
				
				return false;
			}
		}

		return true;
	}
	
}
