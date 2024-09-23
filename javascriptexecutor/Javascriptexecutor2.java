package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement ele=	driver.findElement(By.id("email1"));
	//JavascriptException
	js.executeScript("arguement[0].value=arguemnets[1]", ele,"admin@email.com");
	}

}
