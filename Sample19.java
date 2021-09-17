package rensyuuproject;

class Employee {
	
    private static int number = 0;	// 社員数
    
    private String name;		// 名前
    
    private int salary;			// 給与

    // 名前と給与の値を表示するインスタンスメソッド
    public void show() {
        System.out.print("私の名前は、" + this.name + "です。");
        System.out.println("私の給与は、" + this.salary + "円です。");
    }

    // コンストラクタ
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        Employee.number++;
    }

    // 社員数を表示するクラスメソッド
    public static void showNumber() {
        System.out.println("現在の社員数は、" + Employee.number + "人です。");
    }
}



// Employeeクラスをテストするクラス
public class Sample19 {

	public static void main(String[] args) {
        // 初期状態の社員数を表示する
        Employee.showNumber();

        // 1つ目のインスタンス生成し、社員数を表示する
        Employee tanaka = new Employee("田中一郎", 250000);
        tanaka.show();
        Employee.showNumber();
        
        

        // 2つ目のインスタンス生成し、社員数を表示する
        Employee suzuki = new Employee("鈴木花子", 300000);
        suzuki.show();
        Employee.showNumber();
    }

}
