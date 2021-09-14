package rensyuuproject;

public class ConsIns {

	public static void main(String[] args) {
			
		Student pushiyomi = new Student("Pushiyomi",23);
		
		pushiyomi.greeting();
		
		
	}
	
	class Student {
		
		static int num =0;
		
		String name;
		
		int age;
		
		Student (String name, int age) {
			
			this.name = name;
			
			this.age = age;
			
			this.num +=1;
									
		}
		
		void greeting() {
			
			System.out.println("Hello, my name is " + this.name );
			
			System.out.println("I am"+ this.age + "years old");
		}
		
		
		
		
	}

}
