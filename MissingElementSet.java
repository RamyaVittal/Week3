package Week3Assignment;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementSet {

	public static void main(String[] args) {
		
		int count=0;
Set<Integer> arr = new TreeSet<Integer>(Arrays.asList(2,3,1,4,7,6,8));
System.out.println("Treeset values are: "+arr);
		for(Integer i:arr) {
			count++;
			if(count!=i) {
				System.out.println("Breaking loop as missing element is : "+count);
				break;
			}
			
		}

	}

}
