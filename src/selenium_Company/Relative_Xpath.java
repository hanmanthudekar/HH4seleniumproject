package selenium_Company;

import org.openqa.selenium.By;


	
	
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Relative_Xpath extends Launch_Browsers{

		// Verify That End User can operate same funactionality at any size of browser

		public static void main(String[] args) {
			Launch_Browsers a=new Launch_Browsers();
			a.launchChromedriver();
			d.navigate().to("https://www.google.com/");

			int height = d.manage().window().getSize().getHeight();
			int width = d.manage().window().getSize().getWidth();
			System.out.println("Heigth is = "+height);
			System.out.println("Width is = "+width);
			
			Dimension size = d.manage().window().getSize();
			System.out.println(size.getHeight());
			System.out.println(size.getWidth());
			
			Dimension q = new Dimension(100, 700);
			d.manage().window().setSize(q);
			
			Point po = d.manage().window().getPosition();
			System.out.println(po.getX());
			System.out.println(po.getY());
			
			Point p = new Point(600, 400);
			d.manage().window().setPosition(p);
			d.manage().window().fullscreen();
		}
}
