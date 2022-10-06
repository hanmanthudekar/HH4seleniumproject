package selenium_Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class Firefox_Tab_Window extends Launch_Browsers {
public static void main(String [] args) throws InterruptedException {
	Firefox_Tab_Window a=new Firefox_Tab_Window();
	a.launchFirefoxdriver();
	WebDriver newWindow = d.switchTo().newWindow(WindowType.TAB);
	newWindow.get(url2);
	WebDriver NewWindow1=d.switchTo().newWindow(WindowType.TAB);
	NewWindow1.get(url3);
	Thread.sleep(4000);
	
	d.close();
}
}
