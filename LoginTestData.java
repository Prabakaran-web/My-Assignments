package week3.day2;

public class LoginTestData extends TestData{

	public void enterUsername(){
		
		System.out.println("Username entered");
		
	}
	
	public void enterPassword() {
		
		System.out.println("Password Entered");
		
	}
	
	public static void main(String[]args)
	{
		
		LoginTestData options=new LoginTestData();
		options.enterCredentials();
		options.navigateToHomePage();
		options.enterPassword();
		options.enterUsername();
		}
	
}
