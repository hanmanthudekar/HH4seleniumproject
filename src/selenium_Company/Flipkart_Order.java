package selenium_Company;

import org.openqa.selenium.By;

public class Flipkart_Order extends Launch_Browsers{
public static void main(String [] args) throws InterruptedException {
	Flipkart_Order a = new Flipkart_Order();
	a.launchChromedriver();
	//d.navigate().to("https://www.flipkart.com/");
   // d.findElement(By.xpath("html/body/div/div/div/div/div/div[3]/div/div/div/a")).click();
    d.navigate().to("https://www.flipkart.com/");
    d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div/input ")).sendKeys("8975015726");
    d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input ")).sendKeys("Hanmant@123");
    d.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
    d.findElement(By.xpath("html/body/div/div/div/div/div/div[2]/form/div/div/input")).sendKeys("Oneplus earphones");
    d.findElement(By.xpath("html/body/div/div/div/div/div/div[2]/form/div/button")).click();
	Thread.sleep(5000);
	d.close();
}
}
