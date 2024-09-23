package findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("mukesh otwani");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='c7mM1c']//div[1]//span[1]")).click();
	}

}
