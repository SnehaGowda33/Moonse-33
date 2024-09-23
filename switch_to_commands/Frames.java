package switch_to_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[normalize-space()='Account']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Login/ Sign Up']")).click();
	
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		//using webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='modal']//iframe[@class='modalIframe']")));
		driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("6361771346");
		//switch to mainframe
		driver.switchTo().defaultContent();
	}

}
