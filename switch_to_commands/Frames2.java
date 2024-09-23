package switch_to_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Login/ Sign Up']")).click();
	
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//using id
		//NoSuchFrameException
		driver.switchTo().frame("sneha");
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("6361771346");
		//switch to mainframe
		driver.switchTo().defaultContent();
	}

}
