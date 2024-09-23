package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("mukesh otwani");
		List<WebElement>ele =driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		System.out.println(ele.size());
	}

}
