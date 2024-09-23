package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_insta {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
		ele.sendKeys("sneha.cs.gowda");
		WebElement ele1=driver.findElement(By.xpath("//input[@name='password']"));
		ele1.sendKeys("Pappy@33");
		
		WebElement ele2=driver.findElement(By.xpath("//button[@type='submit']"));
		ele2.click();
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		System.out.println(ele1.isSelected());
		System.out.println(ele2.isSelected());
		System.out.println(ele.getAttribute("name"));
		System.out.println(ele.getCssValue("Border"));
		//it doesn't print anything
		System.out.println(ele.getCssValue("sneha"));
	}

}
