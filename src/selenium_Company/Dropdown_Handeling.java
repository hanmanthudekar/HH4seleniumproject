package selenium_Company;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handeling extends Launch_Browsers {

	public static void main(String [] args) {
		Dropdown_Handeling a = new Dropdown_Handeling();
		a.launchChromedriver();
		d.navigate().to("https://www.facebook.com/r.php");
		WebElement day = d.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1 = new Select(day);
		s1.selectByIndex(12);
		WebElement month = d.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(month);
		s2.selectByValue("8");
		WebElement year = d.findElement(By.xpath("//select[@title='Year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1998");
		
		List <WebElement> opt=s3.getOptions();
		int s= opt.size();
		System.out.println(s);
		for(int i=0;i<s;i++) {
			String Text = opt.get(i).getText();
			System.out.println(Text);
		}
		List<WebElement> opt1 = s1.getOptions();
		int d1 = opt1.size();
		System.out.println(d1);
		for(int i=0;i<d1;i++) {
			String Days = opt1.get(i).getText();
			System.out.println(Days);
		}
		List <WebElement> opt2 = s2.getOptions();
		int d2= opt2.size();
		System.out.println(d2);
		for(int i=0;i<d2;i++) {
			String month1 = opt2.get(i).getText();
			System.out.println(month1);
		}
	 }
}
