package week3.day1;

public class ReverseString {

	public static void main(String[] args)
	{
		String companyName="Testleaf";
		int length1 = companyName.length();
		
		char[] charArray1= companyName.toCharArray();
		
		for (int i=length1-1; i>=0; i--) {
		
			System.out.print(charArray1[i]);
			
			
			
			
			
		}
	}
}
