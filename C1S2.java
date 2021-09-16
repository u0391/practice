package rensyuuproject;

import java.util.ArrayList;
import java.util.Collection;

public class C1S2 {

	public static void main(String[] args) {

		Collection c = new ArrayList();
		
		c.add("hoge");
				
		c.add("foo");
		
		c.add("bar");
		
		c.remove("foo");
		
		System.out.println(c.toString());

	}

}
