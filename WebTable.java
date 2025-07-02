package week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	
	public static void main(String[]args)
	{
		
		EdgeDriver driver=new EdgeDriver();
		
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement element1 = driver.findElement(By.id("txtStationFrom"));
		element1.clear();
		element1.sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		WebElement element2 = driver.findElement(By.id("txtStationTo"));
		element2.clear();
		element2.sendKeys("MDU");
		element2.sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("(//div[text()='Madurai Jn'])[2]")).click();
		
		WebElement checkBox = driver.findElement(By.id("chkSelectDateOnly"));
		if(checkBox.isSelected()) {
			checkBox.click();
		}
		
		
		
		
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'TrainList')]//tbody/tr/td[2]"));
	
		
		for (int i = 0; i <trainNames.size(); i++) {
			
			String textName = trainNames.get(i).getText();
			
			System.out.println(textName);
			
		}
		
		
		Set<String> duplicates=new HashSet<>();
		
		boolean isduplicate=false;
		
		for (int i = 0; i < trainNames.size(); i++) {
		    String name1 = trainNames.get(i).getText();
			
			if(!duplicates.add(name1)) {
				
				System.out.println("Duplicate is "+name1);
				
				isduplicate=true;
			}}
			
			
		
		if (!isduplicate) {
            System.out.println(" No duplicates found.");
		}
				
				
		
	
		

		
				
	
}}
