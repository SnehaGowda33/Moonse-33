package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriver	driver1 =new EdgeDriver();
		WebDriver driver2 = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.quit();
			driver1.quit();
			driver2.quit();
	}

}
