package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[]args)
	{
		int text[]= {6,4,7,3,2,1};
		int n=7;
		int length1 = text.length;
		
		Arrays.sort(text);
		
		
		for (int i = 0; i<length1; i++) {
				
			if(text[i]!=i+1) {
				System.out.println("The Missing number is "+(i+1));
			   return;
			}
			}
			

		}
		
	}



