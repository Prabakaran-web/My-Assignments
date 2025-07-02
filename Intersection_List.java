package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Intersection_List {

	public static void main(String[]args)
	{
		
		//Declare an Array
		int a[]= {3,2,11,4,6,7};
		int[] b= {1,2,8,4,9,7};
		
		//convert array to list
		
		
		List<Integer> List1=new ArrayList<Integer>();
		List<Integer> List2=new ArrayList<Integer>();
		
		
		List1.add(3);//Basic method to add 
		List1.add(2);
		List1.add(11);
		List1.add(4);
		List1.add(6);
		List1.add(7);
		
//		List2.add(1);
//		List2.add(2);
//		List2.add(8);
//		List2.add(4);
//		List2.add(9);
//		List2.add(7);
		
		List2.addAll(Arrays.asList(1,2,8,4,9,7));//to add all the element at once
		//List2.add(1, 4);//to add specific element
		
		
		//adding value to the list from Array through iteration method
		
		for (int i = 0; i <List1.size(); i++) {
			Integer final1 = List1.get(i);
			for (int j = 0; j < List2.size(); j++) {
				
				Integer final2 = List2.get(j);
				
				if(final1.equals(final2))//Doubt--why throwing an exception while using ==
				{
					System.out.println(final2);
				}
			}
			
			
		}
			
		}		
		}
		
	
		
		
