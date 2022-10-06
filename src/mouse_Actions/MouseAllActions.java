package mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAllActions extends Launch_Browsers{

	public static void main(String [] args) {
		MouseAllActions a = new MouseAllActions();
		a.Launch_chrome();
       d.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
       d.switchTo().frame("google_esf");
       WebElement e1=d.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
       WebElement e2=d.findElement(By.xpath("//div[@id='droppable']"));
       Actions s = new Actions(d);
       s.dragAndDrop(e1, e2).perform();
	}
}
