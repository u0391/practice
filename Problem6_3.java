package rensyuuproject;

import org.apache.commons.math3.geometry.spherical.twod.Circle;

public class Problem6_3 {

	public static void main(String[] args) {

		Circle c = new Circle();
		
		//円の半径を設定
		
		c.r = 4.0;
		
		System.out.println("半径"+ c.r+"円の円周の長さは"+c.circumference());
	}

}
