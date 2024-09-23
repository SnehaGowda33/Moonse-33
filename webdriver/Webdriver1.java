package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();
		Thread.sleep(5000);
		win.maximize();
		win.maximize();
		win.minimize();
		
		
		
	}

}
