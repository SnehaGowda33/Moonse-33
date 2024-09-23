package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		WebElement ele=driver.findElement(By.id("email1"));
		/*driver.findElement(By.id("email2"));
		no such element excepiton*/
		ele.sendKeys("admin@email.com");
		/*ele.sendKeys(null);
		 * illegalarguement exception*/
		 
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		 driver.findElement(By.className("submit-btn")).click();
	}

}
