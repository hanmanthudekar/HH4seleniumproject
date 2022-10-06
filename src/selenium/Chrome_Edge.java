package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome_Edge {
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
	WebDriver A=new ChromeDriver();
	
	A.navigate().to("https://www.flipkart.com/mobile-phones-store");
	Thread.sleep(2000);
	A.navigate().to("https://www.google.com/search?q=amazon&oq=amazon&aqs=chrome..69i57.4525j0j4&sourceid=chrome&ie=UTF-8");
	A.manage().window().maximize();
	Thread.sleep(3000);
	A.navigate().to("https://www.whatsapp.com/");
	A.manage().window().minimize();
	Thread.sleep(3000);
	A.navigate().to("https://www.flipkart.com/mobile-phones-store");
	A.manage().window().maximize();
	Thread.sleep(5000);
	A.close();
}
}
