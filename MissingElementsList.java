package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementsList {

	public static void main(String[]args) {
		
		//Declaring an Array
		
		int a[]={1, 2, 3, 4, 10, 6, 8};
		
		//Creating a List
		
		List<Integer> List1=new ArrayList<>();
		
		//Adding Array elements to List
		List1.addAll(Arrays.asList(1,2,3,4,10,6,8));
		//sorting the List
		Collections.sort(List1);
		
		for (int i = 1; i < List1.get(List1.size()-1); i++) {
			
			if(List1.contains(i)==false) {
				
				System.out.println(i);
			
			
		}
		}
		
		
	}
}
