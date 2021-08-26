package rensyuuproject;

public class Machine {

	String serialNumber;
	
	int height;
	
	int width;
	
	int weight;
	
	String product;
	
	int capacity;
	
	void show() {
		
		System.out.println("型番は"+serialNumber+"です");
		
		System.out.println("高さは"+height+"です");
		
		System.out.println("幅は"+width+"です");
		
		System.out.println("重さは"+weight+"です");
		
		System.out.println("生産物は"+product+"です");
		
		System.out.println("生産能力は"+capacity+"です");
		
		
	}
	
	void showData() {
		
		System.out.println("機械の情報を開示します");
		show();
	}
	

}
