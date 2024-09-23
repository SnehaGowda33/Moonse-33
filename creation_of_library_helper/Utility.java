package creation_of_library_helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	//javascriptexecutor
	public static WebElement javascriptexecutor(WebDriver driver,	By ele,String Element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele1=driver.findElement(ele);
		ele1.sendKeys(Element);
		
		//JavascriptException
		js.executeScript("arguement[0].value=arguemnets[1]", ele,Element);
		return ele1;
	}
		
		//0r
		public static void javascriptexecutor1(WebDriver driver,String ele,String Element)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement ele1=driver.findElement(By.id(ele));
			ele1.sendKeys(Element);
			
			//JavascriptException
			js.executeScript("arguement[0].value=arguemnets[1]", ele,Element);
			
			
	}
	//date time class
	public static String datetime()
	{
		SimpleDateFormat d1=new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy");
	String newformat=d1.format(new Date());
	return newformat;
	}
	
	//find elements

	public static void selectallvalues(WebDriver driver,String locator,String Element)
	{
		driver.findElement(By.xpath(locator)).click();
		List<WebElement> ele=driver.findElements(By.xpath(locator));
		for(WebElement ele1:ele)
		{
			if(ele1.getText().contains(Element))
			{
				ele1.click();
				break;
			}
		}
	}
	
	//alert
	public static void alert(WebDriver driver)
	{
		for(int i=0;i<15;i++)
		{
			try {
				org.openqa.selenium.Alert ale=  driver.switchTo().alert();
				
				System.out.println(ale.getText());
				ale.accept();
				break;
				
			} catch (NoAlertPresentException e) {
				// TODO: handle exception
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO: handle exception
					System.out.println("Alert not found-Retrying");
				}
			}
		}
	}
	//takescreenshot for webelement
	public static void captureScreenshotforWebElemment(WebDriver driver,WebElement ele) throws IOException {
	File src=ele.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,  new File("C:\\Users\\Sneha Gowda\\eclipse-workspace\\SeleniumJava\\Screenshots.Webelemnt"+datetime()+".png"));
	driver.quit();
	}
		
	//screenshots
		public static void captureScreenshot(WebDriver driver)
		{
			try {
				FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./Screenshots/screenshot4"+datetime()+".png"));
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	



}

