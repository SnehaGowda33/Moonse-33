package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h2[@class=\"header\"]")));
		
	}

}
