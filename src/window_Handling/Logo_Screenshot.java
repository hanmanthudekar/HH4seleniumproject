package window_Handling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Logo_Screenshot extends Launch_Browsers{
	
	public static void main(String [] args) throws IOException, InterruptedException {
		Launch_Browsers a = new Launch_Browsers();
		a.launchChromedriver();
		
		
			d.manage().deleteAllCookies();
			d.navigate().to("https://bharatpe.com/");

			String path1 = "C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\bharatpe.png";
			File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			File dest = new File(path1);
			FileHandler.copy(src, dest);
			Thread.sleep(2000);
			String path2 = "C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\bharat.png";
			WebElement element1 = d.findElement(By.xpath("//img[@class='b-lazy']"));
			File source = element1.getScreenshotAs(OutputType.FILE);
			File destination = new File(path2);
			FileHandler.copy(source, destination);
			d.quit();

		}
	}


