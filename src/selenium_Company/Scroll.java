package selenium_Company;

import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Scroll a= new Scroll();
		a.launchChromedriver();
		d.navigate().to("https://www.amazon.in/");
		JavascriptExecutor j =((JavascriptExecutor)d);
		j.executeScript("scroll(0,2800)");
		Thread.sleep(2000);
	//	d.close();
	}
}
