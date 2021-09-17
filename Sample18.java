package rensyuuproject;

class Employee {
    private String name;	// 名前
    private int salary;		// 給与

    // フィールドの値を表示するメソッド
    public void show() {
        System.out.print("私の名前は、" + this.name + "です。");
        System.out.println("私の給与は、" + this.salary + "円です。");
    }

    // 引数がないコンストラクタ
    public Employee() {
        this("未設定", 0);
    }

    // 引数が1つあるコンストラクタ（その1）
    public Employee(String name) {
        this(name, 0);
    }

    // 引数が1つあるコンストラクタ（その2）
    public Employee(int salary) {
        this("未設定", salary);
    }

    // 引数が2つあるコンストラクタ
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

// Employeeクラスをテストするクラス
public class Sample18 {
    public static void main(String[] args) {
        // Employeeクラスのインスタンスを生成する
        Employee empA = new Employee();
        Employee empB = new Employee("田中一郎");
        Employee empC = new Employee(250000);
        Employee empD = new Employee("鈴木花子", 300000);

        // フィールドの値を表示する
        empA.show();
        empB.show();
        empC.show();
        empD.show();
    }

}
