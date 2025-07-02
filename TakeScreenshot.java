package week5.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize
		driver.manage().window().maximize();
		
		//finding the element
	WebElement textField = driver.findElement(By.id("username"));
		
       //Take the Screenshot
		File take = textField.getScreenshotAs(OutputType.FILE);
		
		//set the destination 
		
		File store =new File("./shots/sc1.png");
		
		//storing the file
		
		FileUtils.copyFile(take, store);
		
		
	}

}
