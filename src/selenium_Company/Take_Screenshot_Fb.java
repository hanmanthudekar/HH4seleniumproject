package selenium_Company;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot_Fb extends Launch_Browsers{

	public static void main(String [] args) throws IOException, InterruptedException {
		Launch_Browsers a= new Launch_Browsers();
		a.launchChromedriver();
		
		d.navigate().to(url2);
		
	String	path ="C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Amazon.png";
	File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	File b = new File(path);
	FileHandler.copy(src, b);
	Thread.sleep(3000);
	String path2="C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Amazon logo.png";
	WebElement logo =d.findElement(By.xpath("//img[@alt='Recharge or Pay bills']"));
	File ab= logo.getScreenshotAs(OutputType.FILE);
	File sr = new File(path2);
	FileHandler.copy(sr,ab );
	}
}
