package Evaluation16Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario2 {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://DevCon2025.com/Personal-Information/");
		
		//Locate the "Personal Information" form fields and enter valid data.
		
		driver.findElement(By.id("first-name")).sendKeys("Sanket");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("Email")).sendKeys("Sanket02kumar@gmail.com");
		
		//Select one "Dietary Preference" using the radio buttons.
		
		driver.findElement(By.cssSelector("input[value ='Non-Vegeterian']")).click();
		
		//Select at least two "Areas of Interest" using the checkboxes.
		
		driver.findElement(By.cssSelector("input[value ='FrontEnd']")).click();
		driver.findElement(By.cssSelector("input[value ='Testing']")).click();
		
		//Verify that the correct radio button and checkboxes are selected.
		
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[value ='Non-Vegeterian']")).isSelected());
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[value ='FrontEnd']")).isSelected());
		
	}

}
