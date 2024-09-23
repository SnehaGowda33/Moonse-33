package creation_of_library_helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		Utility.alert(driver);
	}

}
