package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot {

	public static void main(String [] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
	   WebDriver d = new ChromeDriver();
	   d.manage().window().maximize();
	   d.manage().deleteAllCookies();
	   d.navigate().to("https://web.whatsapp.com/");
	   
	 //  String path="C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Whtsapp.png";
	 File wh =  ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	 File a=new File("C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\W.png");
	 FileHandler.copy(wh, a);
	}
}
