package rensyuuproject;

public class Dog {

	private String Name;
	
	int Age;
	
	private String Kind;
	
	
	public Dog(String kd) {
		
		
		Kind = kd;
	}
	
	public void SetName(String nm) {
		Name = nm;
		
	}
	
	public void SetAge(int ag) {
		
		Age = ag;
	}
	
	
	public void ShowProfile(){
		
		System.out.println(Kind+"で名前は、"+Name+"、"+Age+"歳です。");
	}
	
	public static class Exercise{
		
		public static void main(String[] args) {
			
			Dog MyDog = new Dog("秋田犬");
			
			MyDog.SetName("ぽち");

			MyDog.SetAge();
			
			MyDog.ShowProfile();
			
		}
	}
		
	

}
