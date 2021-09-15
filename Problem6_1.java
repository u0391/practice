package rensyuuproject;

public class Problem6_1 {

	public static void main(String[] args) {

		Minmax m = new Minmax();
		
		int a = 22, b = 21;
		
		System.out.println(a+"と"+b+"のうち、最大のものは"+m.max(a,b));
		
		System.out.println(a+"と"+b+"のうち、最小のものは"+m.min(a,b));

	}

}
