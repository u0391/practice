package rensyuuproject;

import java.util.ArrayList;
import java.util.Collection;

public class C1S3 {

	public static void main(String[] args) {

		Collection<E> c = new ArrayList();
		
		c.add("hoge");
		
		c.add("foo");
		
		System.out.println(c+"contains \"foo\"?> "+c.contains("foo"));
							
		System.out.println(c+"contains \"bar\"?>"+c.contains("bar"));
		
		

	}

}
