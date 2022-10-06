package selenium_Company;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Window_Maximize extends Launch_Browsers{
 
	public static void main(String [] args) throws InterruptedException {
		
		Launch_Browsers a= new Launch_Browsers();
		a.launchChromedriver();
		
		d.navigate().to("https://www.facebook.com/login/");
		Dimension b = new Dimension(600,700);
		d.manage().window().setSize(b);
	//	Dimension s =d.manage().window().getSize();
		//System.out.println("Height "+s.getHeight());
	//	System.out.println("Width "+s.getWidth());
		
		
		//Point p = new Point(300,400);
		//d.manage().window().setPosition(p);
	
	}
}
