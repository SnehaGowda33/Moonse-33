package creation_of_library_helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
	Utility.javascriptexecutor1(driver, driver.findElement(By.id("email1")), null);
	}

}
