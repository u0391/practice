package rensyuuproject;

class Employee {
	
	protected String name;
	
	protected int salary;
	
	public void show() {
		
		System.out.println("私の名前は、"+this.name+"です。");
		
		System.out.println("私の給与は、"+this.salary+"円です。");
	}
	
	//コンストラクタ
	
	public Employee(String name, int salary) {
		
		this.name = name;
		
		this.salary = salary;
	}
	
}

//会社を表すCompanyクラスの定義(Employeeクラスを集約する）

class Company{
	
	private String name;	//会社名
	
	private int capital;	//資本金（万円）
	
	private Employee[] emp;		//社員
	
	//会社の情報を表示するメソッド
	
	public void showCompanyInfo() {
		
		System.out.println("会社名は、"+this.name+"です。");
		
		System.out.println("資本金は、"+this.capital+"万円です");
	}
	
	//社員の情報を表示するメソッド
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




public class Sample24 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
