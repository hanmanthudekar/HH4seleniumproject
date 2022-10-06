package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Driver {
public static void main(String [] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\velocityTraining\\setups\\Firefox_Driver\\geckodriver-v0.30.0-win64\\geckodriver.exe ");
    WebDriver A=new FirefoxDriver();
    A.get("https://www.amazon.com/");
}
}
