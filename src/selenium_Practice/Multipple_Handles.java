package selenium_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Multipple_Handles extends Launch_Browsers{

	public static void main(String [] args) {
		Multipple_Handles a = new Multipple_Handles();
		a.Launch_Chrome();
		d.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent=d.getWindowHandle();
		System.out.println("parent"+parent);
		JavascriptExecutor j1= ((JavascriptExecutor)d);
		j1.executeScript("scroll(0,1100)");
		d.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		Set<String> Chield=d.getWindowHandles();
		String []chields = new String[2];
		 
		System.out.println("Chield"+Chield);
		for(String ch:Chield) {
			if(!ch.equals(parent)) {
				d.switchTo().window(ch);
				j1.executeScript("scroll(0,400)");
				d.findElement(By.xpath("//input[@name='name']")).sendKeys("Hanmant");break;
			}
			
		}
		
	}
}
