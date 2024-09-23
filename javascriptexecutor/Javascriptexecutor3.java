package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//ElementNotInteractableException
	//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sneha");
		WebElement ele=driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].value=arguments[1]", ele,"Sneha");
	}

}
