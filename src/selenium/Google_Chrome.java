package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Chrome {
public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
	WebDriver A=new ChromeDriver();
	A.navigate().to("https://www.youtube.com/");
}
}
