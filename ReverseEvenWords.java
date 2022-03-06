package Week3Assignment;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
  		String test = "I am a software tester"; 
		String[] sub = test.split(" ");
		char[] ch = null;
		String[] r = new String[10];
		
		for(int i=0;i<sub.length;i++) {
			if(i%2!=0) {
				ch=sub[i].toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					r[i]=ch[j]+"";
					System.out.print(r[i]);
					}}
				else {
					System.out.print(" "+sub[i]+" ");

				}
			}

	}

}
