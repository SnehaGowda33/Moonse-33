package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/scrollTo_demo.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("//div[@class='content demo-x mCustomScrollbar _mCS_2']"));
		
		js.executeScript("arguments[0].ScrollIntoview(true);",ele);
	}

}
