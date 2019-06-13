package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practisepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\qbuser\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.qaclickacademy.com/practice.php");	
		 //Link count in a page
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 
		 //Print the links only in bottom side
		 WebElement bottomdriver = driver.findElement(By.id("gf-BIG"));
		 System.out.println(bottomdriver.findElements(By.tagName("a")).size());
		 
		
	}

}
