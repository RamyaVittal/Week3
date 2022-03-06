package Week3Assignment;

public class CharOccurance {

	public static void main(String[] args) {

					String str = "welcome to chennai";

					int count=0;
					char[] c = str.toCharArray();
					for(int i=0;i<c.length;i++) {
						if(c[i]=='e') {
							count++;
						}
					}
				System.out.println("Count:"+count);		
		

	}

}
