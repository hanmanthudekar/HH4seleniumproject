package window_Handling;

import org.openqa.selenium.By;

public class Mesho extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Launch_Browsers a= new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://meesho.com/auth?redirect=https%3A%2F%2Fmeesho.com%2F&source=profile&entry=header&screen=HP");
		d.findElement(By.xpath("//input[@type='tel']")).sendKeys("8975015726");
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div/button/div")).click();
		Thread.sleep(15000);
		d.findElement(By.xpath("//*[@id=\"__next\"]/div[3]/div/div[2]/div/button")).click();
		
		//d.close();
	}
}
