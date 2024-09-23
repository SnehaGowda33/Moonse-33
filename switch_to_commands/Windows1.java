package switch_to_commands;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')][1]")).click();
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		String Parent=driver.getWindowHandle();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> itr=handle.iterator();
		while(itr.hasNext())
		{
		String child=itr.next();
		if(!child.equals(Parent))
			
		{
			driver.switchTo().window(child);
		  String title=driver.getTitle();
		  System.out.println(title);
		  //NoSuchSessionException
		  driver.quit();
		}
		
		
	
			
		
	}
		driver.switchTo().window(Parent);
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		driver.quit();

}
	}


