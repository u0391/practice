package rensyuuproject;

public class Animal {

	public String Name;
	
	public int Age;
	
	public void ShowProfile() {
		
		System.out.println("名前は、"+Name+ "、"+Age+"歳です。");
		
	}
	
}

class Cat extends Animal{
	
	public void Sleep() {
		
		System.out.println("スースー");
	
}

	public class Exercise{
		
		public void main(String[] args) {
			
			Cat MyCat = new Cat();
			
			Dog MyDog  = new Dog();
			
			
			
			MyCat.Name = "たま";
			MyCat.Age = 3;
			
			MyDog.Name = "ぽち";
			
			MyDog.Age = 4;
			
			MyCat.ShowProfile();
			
			MyDog.ShowProfile();
			
			MyCat.Sleep();
			
			MyDog.Run();
			
			
		
			
			
			
			
		}

	
	
	}


}
