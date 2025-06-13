package week3.day1;

public class ReversetheOddPositionWords {
	
	public static void main(String[]args) {
		
		String test = "I am a software tester";
		String[] split1 = test.split(" ");
		
		for (int i=0;i<split1.length; i++)
		{
			
			if(i%2!=0) {
				
				for (int j = split1[i].length() - 1; j >= 0; j--) 
                    System.out.print(split1[i].charAt(j)+"");
			
			}
			
			
			else{
                
                System.out.print(" "+split1[i] +" ");}
			}
	}}


