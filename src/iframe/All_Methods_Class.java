package iframe;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class All_Methods_Class {
	public static void main(String [] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String path="\"C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe\"";
		String url="https://www.facebook.com/login/";
		System.setProperty(key,path);
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().window().minimize();
		d.get(url);
		d.navigate().to(url);
		d.navigate().forward();
		d.navigate().back();
		Thread.sleep(3000);
		d.close();
		d.quit();
		d.navigate().refresh();
		d.getTitle();
		d.getCurrentUrl();

		//Locators
		d.findElement(By.name(url)).sendKeys(args);
		d.findElement(By.className(url)).sendKeys(args);
		d.findElement(By.id(url)).sendKeys(args);
		d.findElement(By.tagName(url)).click();
		d.findElement(By.linkText(url)).click();
		d.findElement(By.partialLinkText(url)).click();
		d.findElement(By.xpath(path)).click();

		//Handling Multiple Windows
		String parentID=d.getWindowHandle();
		Set<String> ChildId=d.getWindowHandles();
		d.manage().deleteAllCookies();

		//Manage Size of window
		//1) Get Size of window
		Dimension a=d.manage().window().getSize();
		System.out.println(a.getHeight());
		System.out.print(a.getHeight());

		//Set Size of window
		Dimension s =new Dimension(200,899);
		d.manage().window().setSize(s);

		//Set position of window
		Point p =new Point(100,180);
		d.manage().window().setPosition(p);
		//Get Position of window
		Point q=d.manage().window().getPosition();
		File src = new File("Path");

        //frame Handeling
		d.switchTo().frame(0);
		
		
	}
}
