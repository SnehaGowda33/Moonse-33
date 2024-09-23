package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
