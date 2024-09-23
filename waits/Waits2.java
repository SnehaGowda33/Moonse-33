package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Timeouts time=driver.manage().timeouts();
		//default timeouts
		System.out.println(time.getPageLoadTimeout().toSeconds());
		System.out.println(time.getScriptTimeout().toSeconds());
		System.out.println(time.getImplicitWaitTimeout().toSeconds());
	}

}
