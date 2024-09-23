package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("New user? Signup")).click();
		driver.findElement(By.partialLinkText("New user?" )).click();
	}

}
