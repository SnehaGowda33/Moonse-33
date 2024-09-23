package option_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		//incognito mode
			opt.addArguments("--incognito");
			WebDriver driver=new ChromeDriver(opt);
			driver.get("https://freelance-learn-automation.vercel.app/login");
	}

}
