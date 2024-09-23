package SeleniumJava.SeleniumJava;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EdgeDriver driver =new EdgeDriver();
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
	}

}
