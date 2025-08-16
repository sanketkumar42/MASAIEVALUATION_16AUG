package Evaluation16Aug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScenario3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://DevCon2025.com/Personal-Information/");
		
		//From the "Workshop Track" dropdown, select an option (e.g., "Data Science").
		
		Select track = new Select(driver.findElement(By.id("Workshop-Track")));
		track.selectByVisibleText("Data Science");
		
		//Select an option from the "Specific Workshop" dropdown.
		
		Select Specific = new Select(driver.findElement(By.id("Specific-Workshop")));
		Specific.selectByVisibleText("Advance JS");
		
		//Interact with the calendar to select a valid date for the pre-conference seminar.
		driver.findElement(By.cssSelector("td[date='2025-09-26]")).click();
		
	}

}
