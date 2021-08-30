	package rensyuuproject;
	
	public class Car {

		public void accele() {
			
			System.out.println("発進します");
		}
		
		public void brake() {
			
			System.out.println("停止します");
		}
	}
	
	class Soarer extends Car{
		
		boolean roofOpenFlag = false;
		
		public int speed =5;
		
		public void openRoof() {
			
			roofOpenFlag = true;
		}
		
		public void closeRoof() {
			
			roofOpenFlag = true;
		}
		
	}
