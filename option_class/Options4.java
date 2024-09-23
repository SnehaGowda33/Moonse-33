package option_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		//maximize
			opt.addArguments("--Start-maximized");
			WebDriver driver=new ChromeDriver(opt);
			driver.get("https://freelance-learn-automation.vercel.app/login");
	}

}
