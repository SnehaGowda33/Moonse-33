package xpath_css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		Thread.sleep(3000);
        driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'ArretezDAppelerLeMemeUser')]"));
	
		driver.findElement(By.xpath("//div[contains(text(),'ArretezDAppelerLeMemeUser')]/following::div[4]"));
		driver.findElement(By.xpath("//div[contains(text(),'ArretezDAppelerLeMemeUser')]/following::button[1]")).click();
	}

}
