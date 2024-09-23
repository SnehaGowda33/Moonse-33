package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		//driver.navigate().back();
		Navigation nav=driver.navigate();
		nav.back();
		nav.back();
		nav.forward();
		//no such session exception - session id persist
		//driver.close();
		//no such session exception - session id is null
		//driver.quit();
		
		
		nav.refresh();
	}

}
