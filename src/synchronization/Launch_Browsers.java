package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browsers implements TestBase{

static WebDriver d;
	public void launchChromeDriver() {
    System.setProperty(key,path);
    d=new ChromeDriver();
    d.manage().window().maximize();
    d.manage().deleteAllCookies();
	}

}
