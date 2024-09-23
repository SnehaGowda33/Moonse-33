package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//input[@id='email1']"));
		WebElement ele1=driver.findElement(By.xpath("//input[@id='password1']"));
		//Highlighting the element
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:solid 2px black')", ele);
		Thread.sleep(2000);
		js.executeScript("arguments[0].setAttribute('style', 'background:yellow; border:solid 4px black')", ele1);
	}

}
