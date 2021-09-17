package rensyuuproject;


	 class Employee{
		
		private String name;
		
		private int salary;
		
		
		public void show() {
			
			System.out.println("私の名前は、"+this.name+"です。");
			
			System.out.println("私の給与は、"+this.salary+"円です。");
		}
		
		
		
		//コンストラクタ
		
		public Employee(String name , int salary) {
			
			this.name = name;
			
			
			
			this.salary = salary;
		}
	}
	
	//Employeeクラスをテストするクラス
	

public class Sample16 {

	public static void main(String[] args) {

	//Employeeクラスのインスタンスを2つ生成する
		
		Employee tanaka = new Employee("田中一郎",250000);
		
		Employee suzuki = new Employee("鈴木花子",300000);
		
		//それぞれのインスタンスのshowメソッドを呼び出す
		
		tanaka.show();
		
		suzuki.show();
		
		
		
	
	}

}

	
