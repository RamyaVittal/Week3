package Week3Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class FindSecLargestList {

	public static void main(String[] args) {
		List<Integer> s1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
System.out.println(s1);
Collections.sort(s1);
System.out.println("Sorted List"+s1);
int i = s1.size();
System.out.println("Second largest value is"+s1.get(i-2));
	}

}
