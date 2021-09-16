package rensyuuproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

import com.graphbuilder.struc.LinkedList;

public class C0S2 {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();
		
		Collection c2 = (Collection) new LinkedList();
		
		Collection c3 = new HashSet();
		
		Collection c4 = new TreeSet();
		
		System.out.println("c1 = "+ c1.getClass());
		
		System.out.println("c2 ="+ c2.getClass());
		
		System.out.println("c3 = "+c3.getClass());
		
		System.out.println("c4 ="+c4.getClass());
		
		

	}

}
