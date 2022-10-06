package selenium_Company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class NewTab_Window extends Launch_Browsers{
public static void main(String[] args) {
	NewTab_Window n=new NewTab_Window();
	n.launchChromedriver();
	WebDriver newTab1=d.switchTo().newWindow(WindowType.TAB);//Tab will open
	newTab1.get(url3);
	WebDriver newTab=d.switchTo().newWindow(WindowType.WINDOW);//Window will open
	newTab.get(url2);
    d.quit();
}
}
