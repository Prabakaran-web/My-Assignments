package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	
	public static void main(String[]args)
	{
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Testleaf32");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement sourceDrop = driver.findElement(By.name("industryEnumId"));
		Select DropDown=new Select(sourceDrop);
		DropDown.selectByVisibleText("Computer Software");
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select DropDown1=new Select(Ownership);
		DropDown1.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select DropDown2=new Select(source);
		DropDown2.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select campaign=new Select(marketing);
		campaign.selectByIndex(6);
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province=new Select(State);
		province.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}}
