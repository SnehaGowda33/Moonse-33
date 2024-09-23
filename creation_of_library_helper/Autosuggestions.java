package creation_of_library_helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("mukesh otwani");
		Thread.sleep(2000);
		
Utility.selectallvalues(driver,"(//div[@role='presentation'])//b[normalize-space()='course']" , "course");
	}

}
