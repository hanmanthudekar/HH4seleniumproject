package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome\\chromedriver.exe");
	    WebDriver a = new ChromeDriver();
	    a.manage().window().maximize();
	    a.navigate().to("https://www.facebook.com/login/");
	}
}
