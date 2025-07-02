package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Button {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
		//get the title of page
		String titleOfPage = driver.getTitle();
		
	
		System.out.println(titleOfPage);
		
		//naviagting back to the previous page
		driver.navigate().back();
		
		 WebElement buttonenabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/parent::div"));
		
		 //condition statement to check if buttom disabled or not
		if(buttonenabled.isEnabled()) {
		System.out.println("Button is Disabled");
		}
		else
		{
			System.out.println("Button is not disabled");
		}
		
		//location of the button
		WebElement buttonPosition = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		
		Point location = buttonPosition.getLocation();
		int x = location.getX();
			int y = location.getY();
		System.out.println("Location of X is "+x +"Location of Y is "+y);
		
		//Background color of the butti=on
		
		WebElement color = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
	
		String colorBg = color.getCssValue("background-color");//Doubt on CSS value
		
		System.out.println(colorBg);
		
		//Height and width of the button
		
		WebElement heightAndWidth = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/parent::div"));

		Dimension size = heightAndWidth.getSize();	
		
		System.out.println("Height and Width of the button is "+size);
	}

	
	}


