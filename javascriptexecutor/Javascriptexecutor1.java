package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.getElementById(\"email1\").value='admin@email.com'");
	WebElement ele=	driver.findElement(By.id("email1"));
	js.executeScript("arguments[0].value=arguments[1]", ele,"admin@email.com");
	}

}
