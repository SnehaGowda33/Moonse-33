package creation_of_library_helper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotforWebelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Screenshot3.datetime();
		driver.get("https://www.facebook.com/login/");
		Utility.captureScreenshotforWebElemment(driver, driver.findElement(By.xpath("//input[@id='email']")));
driver.quit();

	}

}
