package Week3Assignment;

import java.util.Arrays;

public class Palindrome {
	
	public static void main(String[] args) {
		 String s ="Madam";
		 char[] ch;
		String re = "";
		ch=s.toCharArray();
		Arrays.toString(ch);
		for(int i=ch.length-1;i>=0;i--) {
			re=re+String.valueOf(ch[i]);
		}
		
		System.out.println(re);

		if(s.equalsIgnoreCase(re)) {
			System.out.println("palindrome successful");
		}

	}
	
}
