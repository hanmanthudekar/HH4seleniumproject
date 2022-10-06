package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Edge_Driver {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe");
	WebDriver A=new EdgeDriver();
	A.navigate().to("https://www.flipkart.com/mobile-phones-store");
	A.manage().window().maximize();
	Thread.sleep(3000);
	A.navigate().to("https://www.google.com/search?q=facebook&rlz=1C1GGRV_enIN978IN978&oq=facebook&aqs=chrome..69i57.3323j0j7&sourceid=chrome&ie=UTF-8");
	Thread.sleep(1330);
	A.close();
	}

}
