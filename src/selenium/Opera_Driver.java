package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera_Driver {
public static void main(String [] args) {
	System.setProperty("webdriver.opera.driver", "C:\\velocityTraining\\setups\\OperaDriver\\operadriver_win64\\operadriver.exe");
	WebDriver A=new OperaDriver();
	A.get("https://www.instagram.com/");
	System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
	WebDriver B=new ChromeDriver();
	B.get("https://www.instagram.com/");
}
}
