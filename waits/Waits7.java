package waits;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		//TimeoutException - bcz fotr this we need to wait 10secs after only alert will come ,see in the website interface
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alt.getText());
		alt.accept();
		
		//or
		/*if(alt.getText().contains("Selenium"))
		{
			alt.accept();
		}*/
	}

}
