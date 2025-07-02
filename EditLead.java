package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[]args)
	{
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prabakaran");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Murugan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Murugan");
        driver.findElement(By.className("inputBox")).sendKeys("Testing");
        driver.findElement(By.name("description")).sendKeys("Tester");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suryaprabaaero@gmail.com");
        WebElement stateName = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select city =new Select(stateName);
        city.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("importantNote")).sendKeys("Important Note");
        driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
        String titleOfPage = driver.getTitle();
        System.out.println("The title of page is "+titleOfPage);
        driver.close();
	}
}
