package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args)
	
	{
		
		//Launching the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
	//maximizing the window
		driver.manage().window().maximize();
		//adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click basic check box
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		//click on notification check box
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		//checking the notification text
WebElement element = driver.findElement(By.xpath("//span[@class='ui-growl-title']")); 	
//	//Alert element = driver.switchTo().alert();
	String text = element.getText();
//	
if(text.equals("Checked")) {
		System.out.println("Message verified as :"+text);
	}

else
	System.out.println("Message verified as : "+text);
	
		//selecting JAVA as favourite language
driver.findElement(By.xpath("//label[text()='Java']")).click();
//click tri state check box
driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
//driver.findElement(By.xpath("//span[@text()='checked']/parent::div")).click();
//WebElement element2 = driver.findElement(By.xpath("//span[@text()='State has been changed.']"));
//String text2 = element2.getText();
//System.out.println("Selected text is: "+text2);

//switchon toggle switch
WebElement toggleSwitch = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
toggleSwitch.click();

//unable to locate the message in toggleswitch
	
//driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']")).click();

WebElement Click1 = driver.findElement(By.xpath("//span[text()='Disabled']/parent::div"));//verify if check box is disabled //Doubt
//select dropdown from select multiple
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
//driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).sendKeys("London");
driver.findElement(By.xpath("//label[text()='London']/parent::div")).click();//unable to select any cities need to check with mentor
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	}
	}

