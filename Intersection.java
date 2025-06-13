package week3.day1;

import java.util.Arrays;

public class Intersection {

	public static void main(String[] args)
	{
		int[]a= {3,2,11,4,6,7};
		int[]b= {1,2,8,4,9,7};
		
		//a=2,3,4,6,7
		//b=1,2,4,7,8,9
		
		int length1 = a.length;
		int length2 = b.length;
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0;i<length1;i++)
		{
			
			for(int j=0;j<length2;j++)
			{
				
				if(a[i]==(b[j]))
				{
					
					System.out.println(a[i]);
				    
				}
			}
			
		}
		}
}
