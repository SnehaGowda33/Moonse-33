package switch_to_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		//UnhandledAlertException
	
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("admin@email.com");
	}

}
