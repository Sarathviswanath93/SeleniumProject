package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\qbuser\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://jqueryui.com/droppable/");	
		 
		 //Switch to frame
		 
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		 
		 //Perform drag and drop action
		 
		 Actions a = new Actions(driver);
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement target = driver.findElement(By.id("droppable"));
		 a.dragAndDrop(source, target).build().perform();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Accept")).click();
		
	}

}
