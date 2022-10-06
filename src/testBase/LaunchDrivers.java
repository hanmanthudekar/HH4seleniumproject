package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDrivers  implements TestBase {
	static  WebDriver driver;
	public void LaunchChromeDriver() {
    System.setProperty(key, path);
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
	}

}
