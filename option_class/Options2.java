package option_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Options2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		
		//handle insecure appln
		opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.cacert.org/");
	}

}
