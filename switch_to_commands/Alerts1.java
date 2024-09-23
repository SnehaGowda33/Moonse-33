package switch_to_commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		TargetLocator target=driver.switchTo();
		Alert ale=target.alert();
		
	System.out.println(ale.getText());
	ale.accept();
	
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("admin@email.com");
	}

}
