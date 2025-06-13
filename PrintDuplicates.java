package week3.day1;

import java.util.Arrays;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		

	int[] num={2, 5, 7, 7, 5, 9, 2, 3};
	
	int lengthOfArrays=num.length;
	
	Arrays.sort(num);
	//System.out.println("Numbers in the order"+num[5]);
	
	for(int i=0;i<lengthOfArrays-1;i++)
	{
		if(num[i]==num[i+1]) {
			
			System.out.println("Duplicate values are"+num[i]);
	}
	}
	
}}
