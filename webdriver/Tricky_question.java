package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tricky_question {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver =new EdgeDriver();
	driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		
		//all the 3browsers will execute
		//url will be open only in the firefox;
		//firefox will quit rest of the browsers won't
	}

}
