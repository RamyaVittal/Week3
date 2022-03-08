package Week3Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindIntersectionSet {

	public static void main(String[] args) {
		Set<Integer> s1 = new LinkedHashSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		Set<Integer> s2 = new LinkedHashSet<Integer>(Arrays.asList(1,2,8,4,9,7));

	    List<Integer> list = new ArrayList<Integer>();
	    
		for(Integer i: s1) {
			for(Integer j: s2) {
				if(i==j) {
					list.add(i);
				}
			}

		}
		System.out.println(list);
	}

}
