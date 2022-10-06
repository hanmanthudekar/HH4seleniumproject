package selenium_Practice;

import org.openqa.selenium.Dimension;

public class SetSize extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		SetSize a= new SetSize();
		a.Launch_Chrome();
		d.navigate().to("https://demoqa.com/browser-windows");
	Dimension d1 = d.manage().window().getSize();
		System.out.println(d1.getHeight());
		System.out.println(d1.getHeight());
		Dimension D = new Dimension(230,567);
		d.manage().window().setSize(D);
		Thread.sleep(3000);
		d.quit();
	}
}
