package window_Handling;

import org.openqa.selenium.By;

public class Multiple_Window extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException{
		
		Launch_Browsers a = new Launch_Browsers();
		a.launchChromedriver();
		
		d.navigate().to("https://www.amazon.in/");
		String ParentHandle = d.getWindowHandle();
		System.out.print("Parent Handle is "+ParentHandle);
		
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 12");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		d.close();
	}
}
