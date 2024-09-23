package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Timeouts time=driver.manage().timeouts();
		time.pageLoadTimeout(Duration.ofMillis(500));
		//TimeoutException-bcz no appln will load within 500ms
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
	}

}
