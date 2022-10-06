package selenium_Company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class My_Browser extends Launch_Browsers {
public static void main(String [] args) {
	Launch_Browsers a=new Launch_Browsers();
    a.launchChromedriver();
    d.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
    WebElement Fname=d.findElement(By.name("firstname"));
    Fname.sendKeys("Hanmant");
    WebElement Lname=d.findElement(By.name("lastname"));
    Lname.sendKeys("Hudekar");
   d.findElement(By.name("reg_email__")).sendKeys("hanmanthudekar12@gmail.com");
   d.findElement(By.name("reg_email_confirmation__")).sendKeys( "hanmanthudekar12@gmail.com");
   d.findElement(By.id("password_step_input")).sendKeys("Hanmant@123");
   d.findElement(By.id("day")).sendKeys("13");
   d.findElement(By.id("month")).sendKeys("August");
   d.findElement(By.id("year")).sendKeys("1998");
  // d.findElements(By.id("u_0_7_S9")).se
}
}
