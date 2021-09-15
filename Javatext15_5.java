package rensyuuproject;

public class Javatext15_5 {

	public boolean isValidPlayerName(String name) {
		
		if (name.length() !=8) {
			
			return false;
		}
		
		char first = name.charAt(0);
		
		if(!(first >= 'A' && first <= 'Z')) {
			
			return false;
		}
		
		for(int i = 1; i<8; i++) {
			
			char c = name.charAt(i);
			
			if(!((c >='A' && c<= 'Z')||(c >= '0' && c<='9'))) {
				
				return false;
			}
		}
		return true;
	}
	
	public boolean isValidPlayerName1(String name) {
		
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
