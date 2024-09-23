package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Timeouts time=driver.manage().timeouts();
		//deprecated timeouts
		time.setScriptTimeout(30, TimeUnit.SECONDS);
		//strike indicates not recommended to use
		
	}

}
