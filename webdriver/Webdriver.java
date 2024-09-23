package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
System.out.println("Curent url is " +driver.getCurrentUrl());
System.out.println("page title is " +driver.getTitle());
System.out.println("page source is" +driver.getPageSource());
driver.close();
	}

}
