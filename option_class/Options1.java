package option_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//headless mode-background
		
		
	ChromeOptions opt=new ChromeOptions();
	// opt.setHeadless(true); ------ deprecated one
		opt.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://freelance-learn-automation.vercel.app/login");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
//very imp here to close the browser
driver.quit();
		
	}

}
