package week3.day2;

public class Button extends WebElement {

	
		public void submit() {
			
			System.out.println("Submitted");
		}

		
		public static void main(String[]args)
		
		{
			
			Button options=new Button();
			options.submit();
			
					}
	}


