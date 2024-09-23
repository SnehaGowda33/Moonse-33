package creation_of_library_helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//Utility.selectallvalues(driver, "//table[@class='ui-datepicker-calendar']//a", "30");
		Utility.selectallvalues(driver, "//a[normalize-space()='29']", "29");
	}

}
