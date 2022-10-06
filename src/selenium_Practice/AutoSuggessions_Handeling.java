package selenium_Practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggessions_Handeling extends Launch_Browsers {

	public static void main(String [] args) throws InterruptedException {
		AutoSuggessions_Handeling a= new AutoSuggessions_Handeling();
		a.Launch_Chrome();
		d.navigate().to("https://www.hotel.irctctourism.com/hotel");
		d.findElement(By.xpath("//input[@id='filterText']")).sendKeys("Pune");
		Thread.sleep(3000);
		List<WebElement> opt = d.findElements(By.xpath("//div[@class='autofill-custom-wrap']/ul/li"));
		int count =opt.size();
		System.out.println(count);
		opt.get(count-3).click();
		//d.quit();
	}
}
