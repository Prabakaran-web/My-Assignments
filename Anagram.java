package week3.day1;

import java.util.Arrays;

public class Anagram {

	
	public static void main(String[] args) {
	
		String name1="stops";
		String name2="potss";
		
		int LengthOfName1 = name1.length();
		int lengthOfName2 = name2.length();
		
		if(LengthOfName1==lengthOfName2)
		{
		
			char[] charArray1 = name1.toCharArray();
			char[] charArray2 = name2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			if(Arrays.equals(charArray1, charArray2))
			{
				
				System.out.println("The given strings are Anagram");
			}
			
			else
				System.out.println("The given strings are not an  Anagram");
		}
		else
			System.out.println("Lenghth mismatch,therefore the strings are not an Anagram	");
			
	}
}
