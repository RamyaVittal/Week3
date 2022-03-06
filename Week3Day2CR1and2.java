package week1;

import java.util.ArrayList;
import java.util.List;

public class Week3Day2CR1and2 {

	public static void main(String[] args) {
		int count =0;
List<String> li =  new ArrayList<String>();
li.add("Adam");
li.add("Ben");
li.add("Zara");
li.add("Adam");
li.add("Charlie");
li.add("James");
li.add("Ben");
 System.out.println(li);	
		for(int i=0;i<=li.size()-1;i++) {
				for(int j=i+1;j<li.size();j++) {
				if(li.get(i).equals(li.get(j))) 
					System.out.println(li.get(i));
					}
				}
				for(String g :li) {
					if(g.equals("Adam")) {
					count++;
					}
				}
				System.out.println("Adam occured for:"+count+"times");
 }

}
