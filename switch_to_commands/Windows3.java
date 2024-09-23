package switch_to_commands;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://freelance-learn-automation.vercel.app/login");
		Thread.sleep(2000);
		String Parent=driver.getWindowHandle();
		List<WebElement> ele=driver.findElements(By.xpath("//div[@class='social-btns']//a"));
		int allList=ele.size();
		System.out.println(allList);
		for(int i=0;i<5;i++)
		{
			
			ele.get(i).click();
			System.out.println(i);
		}
		Set<String>allwindows=driver.getWindowHandles();
		List<String> l1=new ArrayList<String>(allwindows);
		Thread.sleep(2000);
		//switch to second tab
		driver.switchTo().window(l1.get(1));
		Thread.sleep(3000);
		
		
		//switch to third tab
	  	driver.switchTo().window(l1.get(2));
	  	Thread.sleep(2000);
	
		//switch to last tab
		driver.switchTo().window(l1.get(allwindows.size()-1));
	    Thread.sleep(2000);
	  
		//switch to parent tab
		driver.switchTo().window(l1.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		Thread.sleep(2000);
        driver.quit();
	
	}

}
