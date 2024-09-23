package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/execute-javascript-selenium-webdriver.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
       driver.manage().window().maximize();
      //Vertical scroll down by 700  pixels
		js.executeScript("window.scrollBy(0,700)");
	
		
	}

}
