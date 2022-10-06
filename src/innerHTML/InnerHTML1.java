package innerHTML;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InnerHTML1 extends Launch_Browsers {

	@FindBy(xpath ="//a[text()='Selenium Practice']")
	WebElement selenium;

	@FindBy(xpath ="(//li[@class=\"parent\"])[6]//a")
	List<WebElement> options;
	
	static WebDriver d;
	public InnerHTML1() {
		PageFactory.initElements(d,this);
	}
	public void s1() {
		Actions s = new Actions(d);
		s.moveToElement(selenium);

		for(WebElement ch : options) {
			String text = ch.getText();
			if(text.equalsIgnoreCase("Alerts")) {
				ch.click();
			}
		}
	}
	public static void main(String [] args) {

		InnerHTML1 a = new InnerHTML1();
		a.launchChromeDriver();
		d.navigate().to("https://www.hyrtutorials.com/");
		a.s1();
	}
}
