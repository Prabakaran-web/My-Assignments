package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Delete_Lead_Assignment {

	public static void main(String[]args)
	{
		
		//Launching browser and load the URL
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		//enter username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads and findleads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
	//enter firstname and lastname

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Prabakaran");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("M");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//driver.findElement(By.xpath("//a[text()='12248']"));		
		
	driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();		
//				
//		WebElement element = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));		
//				
//			element.click();
			
			//driver.findElement(By.linkText("12248")).click();
		
		//Unable to click the lead id or name hence unable to continue the next step.
				
				
				
				
				
				
				
				
				
				
				
		
		
		
	}
}
