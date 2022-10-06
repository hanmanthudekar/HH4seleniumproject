package selenium_Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Launch_Browsers extends TestBase {
    static  WebDriver d;
		
	public void launchChromedriver() {
		System.setProperty(key1, Path1);
		d =new ChromeDriver();
		d.manage().window().maximize();
		
	}

	public void launchFirefoxdriver() {
		System.setProperty(key2, Path2);
		d= new FirefoxDriver();
		d.manage().window().maximize();
	}

	public void launchEdgwDriver() {
		System.setProperty(key4 , Path4);
		 d=new EdgeDriver();
		 d.manage().window().maximize();
	}

}
