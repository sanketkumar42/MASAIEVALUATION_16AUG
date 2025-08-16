package Evaluation16Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testScenarion1 {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://DevCon2025.com/");
		
		//Assert.assertEqual(driver.getTitle(),"DevCon 2025");
		
		WebElement popup = driver.findElement(By.id("popups"));
		WebElement closeButton = driver.findElement(By.id("close-Button"));
		
		//Assert.assertTrue(popup.isDisplayed());
		closeButton.click();
	}

}
