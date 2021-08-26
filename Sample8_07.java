package rensyuuproject;

public class Sample8_07 {

	public static void main(String[] args) {

		String str1, str2;
		
		int i;
		
		str1 = "こんにちは";
		
		str2 = "こんにちは";
		
		if(str1.equals(str2)) {
			System.out.println("str1とstr2は同じ内容です");
		
		}else {
			System.out.println("str1とstr2は違う内容です");
			
		}
		
		str1 = "Stringクラスの利用";
		
		i = str1.length();
		
		System.out.println("str1の長さは"+i+"です。");
		
		//indexOfの使用例
		
		str1 ="あいうえおかきくけこ";
		
		str2 ="かきくけこ";
		
		i=str1.indexOf(str2);
		
		if(i!=-1) {
			System.out.println("str2はstr1の位置"+i+"から始まっています。");
		
		}else {
			System.out.println("str2はstr1に含まれていません。");
		}
		
		str2="さしすせそ";
		
		i=str1.indexOf(str2);
		
		if(i!= -1) {
			System.out.println("str2はstr1の位置から始まっています。");
		
		}else {
			System.out.println("str2はstr1に含まれていません");
		}
		
		
		//substringの使用例
		str2=str1.substring(5,8);
		
		System.out.println("str1の位置5から８までの部分文字列は「"+str2+"」です。");
		
		//replaceの使用例
		str2 = str1.replace("かきくけこ", "たちつてと");
		System.out.println("str1の一部を置き換えた文字列は「"+str2+"」です。");
		
		
		
		
		
		
		
		
		
		
		

	}

}
