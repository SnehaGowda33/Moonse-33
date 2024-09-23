package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {

	public static void main(String[] args) throws WebDriverException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		 FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots/screenshot3.png"));
driver.quit();
	}

}
