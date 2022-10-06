package selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InnerHTML extends Launch_Browsers{

	public static void main(String [] args) {
		InnerHTML a = new InnerHTML();
		a.Launch_Chrome();
		d.navigate().to("https://jqueryui.com/droppable/");
		WebElement e1 = d.findElement(By.xpath("//a[@href='https://contribute.jquery.org/']"));
		Actions as= new Actions(d);
		as.moveToElement(e1).perform();
		List<WebElement> e2 = d.findElements(By.xpath("//li[@class='dropdown']/a"));
		int size=e2.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
		WebElement e3 = e2.get(i);	
		if(i==3) {
			e3.click();
			System.out.println("Clicked");
		}
		}
	}
}
