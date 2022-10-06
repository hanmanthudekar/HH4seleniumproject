package selenium_Company;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot extends Launch_Browsers{


	public static void main(String [] args) throws InterruptedException, IOException {
		Launch_Browsers a = new Launch_Browsers();
		a.launchChromedriver();
        d.navigate().to("https://paytm.com/");
         
        String path="C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Paytm";
        File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        File b = new File(path);
        FileHandler.copy(src, b);
        Thread.sleep(3000);
        d.close();
	}
}
