package switch_to_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//NoAlertPresentException
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("admin@email.com");
	}

}
