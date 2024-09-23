package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
		//driver.findElement(By.xpath("//p[@id='demo']")).getText();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//check presence + visibility +enabled ----- most preferred one
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='demo']")));
		if(element.isDisplayed())
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
		//check presence + visibility ----- preferred one
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='demo']")));
		//check only presence
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='demo']")));
		
	}

}
