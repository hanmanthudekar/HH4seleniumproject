package mouse_Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hidden_Elements_Handeling extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Hidden_Elements_Handeling a = new Hidden_Elements_Handeling();
		a.Launch_chrome();
		d.navigate().to("https://jqueryui.com/droppable/");
		d.switchTo().frame(0);
		WebElement e1=d.findElement(By.xpath("//div[@id='draggable']"));
		WebElement e2=d.findElement(By.xpath("//div[@id='droppable']"));
		Actions a1=new Actions(d);
		a1.dragAndDrop(e1, e2).perform();
		
		Thread.sleep(7000);
		d.quit();
	}
}
