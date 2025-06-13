package week3.day1;

public class OddindextoUpperCase {

	public static void main(String[] args)
	
	{
		String test="changeme";
		int length1 = test.length();
		
		char[] charArray1 = test.toCharArray();
		
		for (int i = 0; i<length1; i++) {
			
			if(i%2!=0) {
				
			charArray1[i]=Character.toUpperCase(charArray1[i]);// doubt
			
			System.out.print(charArray1[i]);
			}
			
			else
				System.out.print(charArray1[i]);
			
		
			
			
		}
	}
}
