package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_List {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		//Launching URL
		driver.get("https://www.amazon.in/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//search for phones
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		
		//Creating the List for all webelements
		
		// unable to locate the element for price for all products
		List<WebElement> elementsList = driver.findElements(By.xpath("\\span[@class='a-price-whole']"));
		
		
		
		
		List<Integer> price1=new ArrayList<>();
		
		//Get all the price through loop and remove other text except numbers
		
		for (int i = 0; i <elementsList.size(); i++) {
			
			String text1 = elementsList.get(i).getText();
			text1.replaceAll("[^0-9]","");//remove text and special characters
			if(!text1.isEmpty()){
				
				int price = Integer.parseInt(text1);//converting text into int 
				
				price1.add(price);//adding all the price and store in list
				
			}
			
		}
		
 		Collections.sort(price1);//sorting the price ascending order
		
 		
 		//verifying and printing lowest price
 		
 		if (!price1.isEmpty()) {
 			
            System.out.println("Lowest Phone Price is : " + price1.get(0));
        } else {
            System.out.println(" No prices found.");
        }

		
	}

}
