package Week3Assignment;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] c = test.toCharArray();
		for(char c1: c) {
			if((c1>='a')&&(c1<='z')||(c1>='A')&&(c1<='Z')) {
				letter++;
			}
			else if(c1==' ') {
					space++;
				}
			else if((c1>='0')&&(c1<='9')) {
					num++;
				}
			else
			{
				specialChar++;
			}
						
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

}
