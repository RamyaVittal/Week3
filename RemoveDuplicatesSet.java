package Week3Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		Set<String> strSet = new LinkedHashSet<String>();
		 for(int k = 0;k<str.length;k++) {
			 strSet.add(str[k]);
			 }
System.out.print("Print added set"+strSet); //As per set property, it wont allow duplicate values
		
	}
	
}


