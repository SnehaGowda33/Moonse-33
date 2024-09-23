package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		//since it is a interface,we have done typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		//we need to capture the ss in the output file so we call the screenshot method
		File src=ts.getScreenshotAs(OutputType.FILE);
		//since it is stored in the temp location it wil went off when we close the pgm so we need to copy it to the permanent location
		
		File dest=new File("C:\\Users\\Sneha Gowda\\eclipse-workspace\\SeleniumJava\\Screenshots/screenshot1.png");
	    FileHandler.copy(src, dest);
	}
	

}
