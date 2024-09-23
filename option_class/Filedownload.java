package option_class;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Filedownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions opt=new ChromeOptions();
Map<String,Object> downloadMap=new HashMap<String, Object>();
//downloadMap.put("download.default_directory", System.getProperty("user.dir")+"./SeleniumJava/DownloadFiles");
downloadMap.put("download.default_directory", "./SeleniumJava/DownloadFiles");
opt.setExperimentalOption("prefs", downloadMap);//key,value
WebDriver driver= new ChromeDriver(opt);
driver.get("https://the-internet.herokuapp.com/download");
driver.findElement(By.xpath("//a[normalize-space()='LeoMessi.jpg']")).click();
//verify the file is downloaded or not
String downloadDirectory=("./SeleniumJava/DownloadFiles");
File dest=new File(downloadDirectory);
if(dest.length()>0)
{
	System.out.println("File is downloaded");
}
else
{
	System.out.println("File not downloaded");
}
	}

}
