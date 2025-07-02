package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActions {
	
	public static void main(String[]args) throws IOException
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		//Launching the URL
		driver.get("https://www.amazon.in/");
		//Maximizing window
		driver.manage().window().maximize();
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//search for product 
		
		WebElement search1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		
		search1.sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//find the price for first product
		
		WebElement price1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	
		 String price2= price1.getText();//Storing as string value to get it in console
	   
	     
	     System.out.println("Price for first product is : "+price2);
	     
	     //find the number of rating
	     
	     WebElement rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
	    
	     String customerRating=rating.getText();
	     
	     System.out.println("Number of customer rating is "+customerRating);
	     //click the first text link
	     
	     driver.findElement(By.xpath("(//h2/parent::a)[1]")).click();
	     
	     //Take the screenshot
	     
	     File screenshot = driver.getScreenshotAs(OutputType.FILE);
	     
	     //select the path
	      File save=new File("./AmazonProducts/image.png");
	      
	      FileUtils.copyFile(screenshot,save);
	      //add to cart 
	      
	      driver.findElement(By.id("add-to-cart-button")).click();
	      
	      //checking cart subtotal
	      	
	      WebElement total = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	      
	      String subtotal= total.getText();
	      
	      //verifying cart subtotal with price
	      
	      if(price2.equals(subtotal)) {
	      System.out.println("Cart Subtotal "+subtotal);
	      }
	       
	      else
	      {
	    	  System.out.println("not equaL");
	      }
	     
	      driver.quit();
	     
	     
	}

}
