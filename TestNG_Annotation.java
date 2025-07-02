package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;

public class TestNG_Annotation {
	
	
	public static void main(String[]args) 
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Now try to click the waffle toggle (App Launcher)
		
		    WebElement waffleBtn = driver.findElement(By.xpath("//button[contains(@class,'slds-button') and .//div[contains(@class,'slds-icon-waffle')]]"));
		    waffleBtn.click();
		    
	
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//	   WebElement legalEntity = driver.findElement(By.xpath("(//a[@class='al-tab-item'])[79]"));
//
//		
//		legalEntity.click();
		
	   driver.findElement(By.xpath("//p[text()='Legal Entities']/parent::span")).click();
	   //after viewall option legal entities not opening .tried above "a" tag as well as using text
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Test");
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
		
		WebElement dropdown = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[24]"));
	     
	     dropdown.click();
	     
	
	}}