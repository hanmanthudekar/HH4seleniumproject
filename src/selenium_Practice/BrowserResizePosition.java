package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserResizePosition extends Launch_Browsers {

	public void a1() throws InterruptedException {
		d.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		Dimension size = d.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getHeight());
		Dimension sd=new Dimension(244,500);
		d.manage().window().setSize(sd);

		Point p = new Point (300,400);
		d.manage().window().setPosition(p);
		Thread.sleep(4000);
		d.quit();
	}
	public void dropdown() {
		d.navigate().to("https://www.facebook.com/reg/");
		WebElement opt = d.findElement(By.xpath("//select[@id='year']"));
		Select a= new Select(opt);
		a.selectByVisibleText("1998");
	        List<WebElement> e1 = a.getOptions();
	     int count = e1.size();
	     System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = e1.get(i).getText();
			System.out.println(text);
		}
		d.quit();
	}
	public static void main(String [] args) throws InterruptedException {
		BrowserResizePosition s = new BrowserResizePosition();
		s.Launch_Chrome();
		s.a1();
		//Thread.sleep(4000);
		s.Launch_Chrome();
		s.dropdown();
	}
}
