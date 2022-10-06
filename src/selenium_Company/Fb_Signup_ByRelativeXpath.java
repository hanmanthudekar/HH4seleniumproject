package selenium_Company;

import org.openqa.selenium.By;

public class Fb_Signup_ByRelativeXpath extends Launch_Browsers {

	public static void main(String [] args) throws InterruptedException {
		
		Launch_Browsers a=new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://www.facebook.com/signup");
		d.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hanmant");
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hudekar");
		d.findElement(By.xpath("//input[contains(@name,\"reg_email__\")]")).sendKeys("hanmanthudekar@gmail.com");
		d.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys("hanmanthudekar@gmail.com");
        d.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Hnajgwskwjh");
        
		Thread.sleep(9000);
		d.close();
	}
}
