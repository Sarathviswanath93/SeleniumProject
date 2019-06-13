package TestCases;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\qbuser\\Downloads\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		 driver.findElement(By.linkText("Help")).click();
		 
		 //getting window ids
		 
		 Set<String> ids=driver.getWindowHandles();
		 java.util.Iterator<String> it=ids.iterator();
		 String parentid = it.next();
		 String childid = it.next();
		 driver.switchTo().window(childid);
		 System.out.println(driver.getTitle());
	}

}
