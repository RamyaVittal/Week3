package Week3Assignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		List<String> strList = new ArrayList<String>();
		String[] str = text.split(" ");
		 for(int k = 0;k<str.length;k++) {
			 strList.add(str[k]);
		 	}

		int count=0;
		for(int i=0;i<=strList.size()-1;i++) {
			for(int j=i+1;j<strList.size();j++) {
				if(strList.get(i).equalsIgnoreCase(strList.get(j))) {
					count++;
					if(count>0) {
						//strList.set(j,"");
						strList.remove(j);
					}
				}
			}
	}
		System.out.println(strList);
	}
}


