package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logininsta_using_js {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
		js.executeScript("arguments[0].value=arguments[1]", ele,"6361771346");
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].value=arguments[1]", ele1,"Pappy@33");
		WebElement ele2=driver.findElement(By.xpath("//button[@type='submit']"));
		//ele2.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",ele2);
	}

}
