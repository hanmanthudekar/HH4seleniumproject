package selenium_Company;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class Position_Window extends Launch_Browsers {

	public static void main(String [] args) {
		
		Launch_Browsers a= new Launch_Browsers();
	//	a.launchChromedriver();
		a.launchFirefoxdriver();
		d.navigate().to("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIwMXMgJGB9gIVb5JmAh08VAgYEAAYASAAEgIM7PD_BwE");
		//Dimension size = new Dimension(100,200);
		//d.manage().window().setSize(size);
		
		Point b = new Point(100,100);
		d.manage().window().setPosition(b);
		
	Dimension s =	d.manage().window().getSize();
		System.out.println(s.height);
		System.out.println(s.width);
		
	}
}
