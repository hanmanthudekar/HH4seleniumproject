package selenium_Company;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Guru99 extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException, IOException {
		Launch_Browsers a =new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://demo.guru99.com/test/guru99home/");
		String ParentHandle =d.getWindowHandle();
		System.out.println(ParentHandle);
		d.findElement(By.id("a077aa5e")).click();
		Set<String> Child_Handles=  d.getWindowHandles();
		System.out.println(Child_Handles);
		for(String ch:Child_Handles) {
			if(!ParentHandle.equals(ch)) {
				d.switchTo().window(ch);
				WebElement guru=d.findElement(By.className("custom-logo"));
				
			File sr=	guru.getScreenshotAs(OutputType.FILE);
			File b=new File("C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\guru.png");
			FileHandler.copy(sr, b);
				d.close();
			}
		}
		d.switchTo().window(ParentHandle);
		WebElement g =d.findElement(By.xpath("//img[@role='presentation']"));
		File guru1=g.getScreenshotAs(OutputType.FILE);
		File src=new File("C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\guru1.png"); 
		FileHandler.copy(guru1, src);
		Thread.sleep(3000);
		d.close();
	}
}
