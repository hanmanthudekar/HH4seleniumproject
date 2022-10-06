package selenium_Company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class InnerHtml extends Launch_Browsers{

	public static void main(String [] args) {
		InnerHtml as = new InnerHtml();
		as.launchChromedriver();
		d.navigate().to("https://jqueryui.com/droppable/");
		WebElement element1 = d.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions a=new Actions(d);
		a.moveToElement(element1).perform();
		List<WebElement> element2 = d.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count =element2.size();
		System.out.println(count);
		for(int b=0;b<count;b++) {
			WebElement element3 = element2.get(b);
			String text=element3.getAttribute("innerHTML");
			System.out.println(text);
			if(text.equals("Appium")) {
				element3.click();
			}
		}
		d.close();
	}
}
