package screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import creation_of_library_helper.Utility;

public class Screenshot4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
Utility.captureScreenshot(driver);
driver.quit();
	}

}
