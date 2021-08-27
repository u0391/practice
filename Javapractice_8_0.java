package rensyuuproject;

public class Javapractice_8_0 {
		
		private String serialNumber;
		
		private int height;
		
		private int wight;
		
		private int weight;
		
		private String product;
		
		private int capacity;
		
		void show() {
			
			System.out.println("型番は"+serialNumber+"です");
			
			System.out.println("高さは"+height+"cmです");
			
			System.out.println("幅は"+wight+"kgです");
			
			System.out.println("重さは"+weight+"kgです");
			
			System.out.println("生産物は"+product+"です");
			
			System.out.println("生産能力は1分間に"+capacity+"個です");
			
			System.out.println("--------------------------");
		}
		
		void showData() {
			
			System.out.println("機械の情報を表示します");
			
			show();
		}
		
		void setSerialNumber(String sn) {
			
			serialNumber= sn;
		}
		
		void setHeight(int h) {
			
			height = h;
		}
		
		void setWidth(int wi) {
			
			wight = wi;
		}
		
		void setWeight(int we) {
			
			weight = we;
		}
		
		void setProduct(String p) {
			
			product = p;
		}
		
		void setCapacity(int c) {
			capacity=c;
		}
		
		void setValue(String sn, int h, int wi, int we, String p, int c) {
			
			serialNumber = sn;
			
			height = h;
			
			wight = wi;
			
			weight = we;
			
			product = p;
			
			capacity = c;
		}
		
		boolean mix(String s1, String s2, String s3) {
			
			if(s1 == "砂糖" && s2=="水" && s3=="香料") {
				
				System.out.println("ペースト状のアメができました");
				
				return true;
				
			}else {
				System.out.println("ペースト状のアメの作成に失敗しました");
				
				return false;
			}
		}
		
		boolean molding(int i, String s) {
			
			if(i>capacity) {
			
				System.out.println("成形する数が生産能力を上回っています");
				
				return false;
			
			}else {
				
				System.out.println(s+"型のアメを"+i+"個、成形できました");
				
				return true;
			}
			
		}	
		
		
		
	}


