package selenium_Company;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class Multiple_Windows extends Launch_Browsers {

	public static void main(String [] args) throws InterruptedException {
		
		Launch_Browsers a = new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html?m=1");
	    String	parentHandle = d.getWindowHandle();
	    System.out.println(parentHandle);
	    JavascriptExecutor j=((JavascriptExecutor)d);
	    j.executeScript("scroll(0,600)");
	    d.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
	 Set<String> pcHandles=   d.getWindowHandles();
		System.out.println(pcHandles);
		
		for(String ch:pcHandles) {
			if(!ch.equals(parentHandle)) {
			d.switchTo().window(ch);
			}
		}
		Thread.sleep(3000);
		d.close();
	}
}
