package rensyuuproject;

public class Sample8_03 {

	public static void main(String[] args) {


Machine machine1 = new Machine();
		
		machine1.serialNumber = "M001";
		
		machine1.height = 150;
	
		machine1.width = 120;
		
		machine1.weight = 98;
		
		machine1.product = "キャンディ(レモン味)";
		
		machine1.capacity = 100;
		
		
		Machine machine2 = new Machine();
		
		machine2.serialNumber="M002";
		
		machine2.height = 140;
		
		machine2.width = 110;
		
		machine2.width = 95;
		
		machine2.product ="キャンディ（リンゴ味）";
		
		machine2.capacity = 120;
		
				
		
		machine1.show();
		
		machine2.show();
		
		

	}

}
