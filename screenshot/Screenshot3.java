package screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {
	
	public static String datetime()
	{
	
	
	SimpleDateFormat d1=new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
	String newformat=d1.format(new Date());
	return newformat;
	}

	public static void main(String[] args) throws WebDriverException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//Screenshot3.datetime();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		 FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots.Screenshot"+datetime()+".png"));
		 driver.quit();
	}

}
