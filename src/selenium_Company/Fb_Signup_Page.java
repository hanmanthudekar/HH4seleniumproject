package selenium_Company;

import org.openqa.selenium.By;

public class Fb_Signup_Page extends Launch_Browsers{

	public static void main(String[] args) throws InterruptedException {
		Fb_Signup_Page A=new Fb_Signup_Page();
		A.launchChromedriver();
		//A.launchFirefoxdriver();
	    d.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
        d.findElement(By.name("firstname")).sendKeys("Hanmant");
	    d.findElement(By.name("lastname")).sendKeys("Hudekar");
	    d.findElement(By.name("reg_email__")).sendKeys("hanmanthudekar@gmail.com");
	    d.findElement(By.name("reg_email_confirmation__")).sendKeys("hanmanthudekar@gmail.com");
	    d.findElement(By.name("reg_passwd__")).sendKeys("45426373268");
	    d.findElement(By.id("day")).sendKeys("13");
	    d.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Aug");
	   // Thread.sleep(4000);
	 //   d.quit();
	}
}
