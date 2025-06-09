package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");	
		driver.manage().window().maximize();	
		
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Prabakaran");
		driver.findElement(By.name("lastname")).sendKeys("M");
		WebElement sourceDrop = driver.findElement(By.id("day"));
		
		WebElement  sourceDrop1 = driver.findElement(By.id("month"));
		
		WebElement sourceDrop2 = driver.findElement(By.id("year"));
		Select dropDown=new Select(sourceDrop);
		Select dropDown1 =new Select(sourceDrop1);
		Select dropDown2=new Select(sourceDrop2);
		dropDown.selectByIndex(2);
		dropDown1.selectByVisibleText("Nov");
		dropDown2.selectByValue("1993");
	
		driver.findElement(By.name("reg_email__")).sendKeys("7708268128");
		driver.findElement(By.id("password_step_input")).sendKeys("Pappa@2022");
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex' and @value='-1']"));
        gender.click();
		
	}}