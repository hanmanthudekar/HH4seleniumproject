package window_Handling;

import java.util.Set;

import org.openqa.selenium.By;

public class Naukari extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Launch_Browsers a = new Launch_Browsers();
		a.launchChromedriver();
	    d.navigate().to("https://www.naukri.com/");
	    d.findElement(By.xpath("//a[@id=\"register_Layer\"]")).click();
	    String ParentHandle = d.getWindowHandle();
	    System.out.println("Parent Handle is "+ParentHandle);
	    Set<String> ChildHandles = d.getWindowHandles();
	    System.out.println("Child Handles "+ChildHandles);
	    for(String ch:ChildHandles) {
	    	if(!ParentHandle.equals(ch)) {
	    	d.switchTo().window(ch);
			Thread.sleep(2000);
		    d.findElement(By.xpath("//input[@id='name']")).sendKeys("Hanmant");
		    Thread.sleep(4000);
             d.close();
	    }}
	    d.switchTo().window(ParentHandle);
	    d.findElement(By.xpath("//input[1][@class='suggestor-input ']")).sendKeys("Automation Tester");
	}
	
}
