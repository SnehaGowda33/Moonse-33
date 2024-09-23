package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrenshotofWebElement {
	public static String datetime()
	{
	
	
	SimpleDateFormat d1=new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
	String newformat=d1.format(new Date());
	return newformat;
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
File src=driver.findElement(By.xpath("//input[@id='email']")).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,  new File("C:\\Users\\Sneha Gowda\\eclipse-workspace\\SeleniumJava\\Screenshots.Screenshot"+datetime()+".png"));
driver.quit();
	}

}
