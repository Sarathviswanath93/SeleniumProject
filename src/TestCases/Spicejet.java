package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Browser Initilization
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\qbuser\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 //implicit wait
		 
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 
		 //Maximizing window
		 
		 driver.manage().window().maximize();
		 
		 //Navigating to URL
		 
		 driver.get("https://www.spicejet.com/");
		 
		 //Choose Departure city as Delhi
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 WebDriverWait wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		 driver.findElement(By.xpath("//a[@value='DEL']")).click();
		 
		 //Choosing Arrival City
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		 
		 //Choosing Current Day
		 
		 driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		 
		 //Choosing 3 Adults
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divpaxinfo")));
		 
		 driver.findElement(By.id("divpaxinfo")).click();
		 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hrefIncAdt")));
		 
		 for(int i=1; i<3;i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		
		//Choosing 2 childs
	
		 
		 for(int i=1;i<3;i++)
		 {
			 driver.findElement(By.id("hrefIncChd")).click();
		 }
		 
		 
		 //Choosing 2 infants
		 
		 for(int i=1;i<3;i++)
		 {
			 driver.findElement(By.id("hrefIncInf")).click();
		 }
		 
		 //Clicking on done button
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnclosepaxoption")));
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 
		 //Click on search button
		 
	    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
	}
	

}
