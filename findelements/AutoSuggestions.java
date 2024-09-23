package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		int count =ele.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement element=ele.get(i);
			String name=element.getText();
		}
	}

}
