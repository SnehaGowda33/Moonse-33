package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
		//driver.findElement(By.xpath("//p[@id='demo']")).getText();
		Wait<WebDriver> w1=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NotFoundException.class);
		w1.until(Function<WebDriver,WebElement>)
		System.out.println(alt.getText());
		alt.accept();
	}

}
