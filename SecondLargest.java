package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[]args) {
		
		//Declare an Array
		
		int a[]= {2,3,4,6,7,11};
		 
		List<Integer> List1=new ArrayList<>();
		
		//Adding all the values to List
		
		List1.addAll(Arrays.asList(2,3,4,6,7,11));
		
	     //Sorting the List1 in ascending order
	        Collections.sort(List1);
	        
	      Integer F1 = List1.size();	//To get the size (number of elements)
	      
	      //to get the second largest from last to first -2 to be used as per index order.if last value -1
	      
	     Integer secondLargest = List1.get(F1-2);
		
	      System.out.println(secondLargest);
		
		
		
	}
}
