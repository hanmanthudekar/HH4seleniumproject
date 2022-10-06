package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\velocityTraining\\setups\\Firefox_Driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver A=new FirefoxDriver();
	A.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1GGRV_enIN978IN978&oq=facebook&aqs=chrome..69i57.3323j0j7&sourceid=chrome&ie=UTF-8");
	Thread.sleep(3000);
	A.manage().window().maximize();
	A.navigate().to("https://www.wikipedia.org/");
	A.manage().window().minimize();
	Thread.sleep(4000);
	A.manage().window().maximize();
	Thread.sleep(1000);
	A.manage().window().minimize();
	
}
}
