package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\qbuser\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 Actions a = new Actions(driver);
		 a.moveToElement(driver.findElement(By.id("nav-link-yourAccount"))).build().perform();
		 
		 Thread.sleep(3000);
		
		 a.moveToElement(driver.findElement(By.id("nav_prefetch_yourorders"))).click(driver.findElement(By.id("nav_prefetch_yourorders"))).build().perform();
		
		
		
	}

}
