package week4.day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		//String window1 = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
        List<String> windows = new ArrayList<>(windowHandles);
        
        driver.switchTo().window(windows.get(1));
		
       //driver.findElement(By.xpath("//a[text()='13229']/parent::div")).click();
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
       
       driver.switchTo().window(windows.get(0));
       
       driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
       Set<String> windowHandles2 = driver.getWindowHandles();
       List<String> windows2 = new ArrayList<>(windowHandles2);
       driver.switchTo().window(windows2.get(1));
       driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).click();
       driver.switchTo().window(windows2.get(0));
       driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
       
       Alert alertmsg = driver.switchTo().alert();
       alertmsg.accept();
}}
