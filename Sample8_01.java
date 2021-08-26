package rensyuuproject;

public class Sample8_01 {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		
		machine1.serialNumber = "M001"
;
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
		
		
		
		
		
		System.out.println("machine1の型番は"+machine1.serialNumber+"です");
		
		System.out.println("machine1の高さは"+machine1.height+"です");
		
		System.out.println("machine1の幅は"+machine1.width+"です");
		
		System.out.println("machine1の重さは"+machine1.weight+"です");
		
		System.out.println("machine1の生産物は"+machine1.product+"です");
		
		System.out.println("machine1の生産能力は"+machine1.capacity+"です");
		
		System.out.println("-----------------");
		
		
		System.out.println();

		
	}
}
