package rensyuuproject;

public class Kihon_Sansyou {

	public static void main(String[] args) {
		
		String a ="あ行";
		
		String f;
		
		f=a;
		
		f="か行";
		
		System.out.println(a);
		
		
		
		
		int b= 3;
		
		int bb;
		
		bb=b;
		
		bb=8;
		
		System.out.println(b);
		
		
				
		
		
		int [] arrayA = {30,25,90};
		
		int [] arrayB;
		int [] arrayC = {20,40,60};
		
		arrayB = arrayA;
		arrayA = arrayC;
		
		arrayB[0]=100;
		arrayA[0] = 200;
		
		System.out.println(arrayA[0]);		//20
		System.out.println(arrayB[0]);		//100
		System.out.println(arrayC[0]);		//20
		
		
		String [] c = {"さし","すせ","そ"};
		
		String [] d;
		
		d=c;
		
		d[0]="たちつてと";
		
		
		System.out.println(c[0]);
		
		
		String[] ar_A = {"あ", "い", "う"};
		String[] ar_B = {"か", "き", "く"};
		
		ar_B = ar_A;
		ar_A[0] = "さ";
		
		System.out.println(ar_A[0]);	//さ
		System.out.println(ar_B[0]);	//さ
		
	}

}
