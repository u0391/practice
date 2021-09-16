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
		// TODO 自動生成されたメソッド・スタブ

	}

}
