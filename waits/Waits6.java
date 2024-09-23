package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//element is not present in dom ,now its give nosuch element exception after 10secs not immediately
		driver.findElement(By.id("Sneha")).sendKeys("abc");
	}

}
