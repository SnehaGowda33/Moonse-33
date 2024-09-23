package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement state=driver.findElement(By.id("name"));
	//unexpected Tagname exception
		Select stateDD = new Select(state);
		stateDD.selectByIndex(3);
	}

}
