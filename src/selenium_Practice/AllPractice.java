package selenium_Practice;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
public class AllPractice {

public void A1() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
	WebDriver z=new ChromeDriver();
	z.navigate().to("https://testautomationpractice.blogspot.com/");
	z.manage().window().maximize();
	String Parent=z.getWindowHandle();
	System.out.println(Parent);
	WebElement s=z.findElement(By.xpath("//img[@align='top']"));
	s.click();
	Set<String> child1=z.getWindowHandles();
	System.out.println(child1);
	for(String a: child1)
	{
		if(!Parent.equals(a))
		{
			z.switchTo().window(a);
			Thread.sleep(2000);
			z.close();
		}
	}
	z.switchTo().window(Parent);
	z.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("chutmarichya");
	z.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	Thread.sleep(2000);
	String A12=z.switchTo().alert().getText();
	System.out.println(A12);
	z.switchTo().alert().dismiss();
	
	WebElement f=z.findElement(By.xpath("//select[@id='speed']"));
	Select Q1=new Select(f);
	Q1.selectByVisibleText("Medium");
	Thread.sleep(2000);
	WebElement f1=z.findElement(By.xpath("//select[@id='files']"));
	Select Q2=new Select(f1);
	Q2.selectByVisibleText("TXT file");
	Thread.sleep(2000);
	WebElement f2=z.findElement(By.xpath("//select[@id='number']"));
	Select Q3=new Select(f2);
	Q3.selectByVisibleText("3");
	Thread.sleep(2000);
	WebElement f3=z.findElement(By.xpath("//select[@id='products']"));
	Select Q4=new Select(f3);
	Q4.selectByVisibleText("Iphone");
	WebElement f4=z.findElement(By.xpath("//select[@id='animals']"));
	Select Q5=new Select(f4);
	Q5.selectByVisibleText("Baby Cat");
	Thread.sleep(2000);
	z.switchTo().frame("frame-one1434677811");
	Thread.sleep(2000);
	z.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("MUMVV");
	z.findElement(By.xpath("//input[@name='RESULT_TextField-2']")).sendKeys("MUMVV");
	z.findElement(By.xpath("//input[@name='RESULT_TextField-3']")).sendKeys("MUMVV");
	z.findElement(By.xpath("//input[@name='RESULT_TextField-4']")).sendKeys("MUMVV");
	z.findElement(By.xpath("//input[@name='RESULT_TextField-5']")).sendKeys("MUMVV");
	z.findElement(By.xpath("//input[@name='RESULT_TextField-6']")).sendKeys("m@lwevlm");
	z.findElement(By.xpath("//label[@for='RESULT_RadioButton-7_0']")).click();
	z.findElement(By.xpath("//label[@for='RESULT_CheckBox-8_0']")).click();
	WebElement f5=z.findElement(By.xpath("//select[@id='RESULT_RadioButton-9']"));
	Select Q6=new Select(f5);
	Q6.selectByVisibleText("Morning");
     z.switchTo().defaultContent();
	JavascriptExecutor Z1=((JavascriptExecutor)z);
	Z1.executeScript("scroll(0,-1100)");
	WebElement Z2=z.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	Actions d=new Actions(z);
	d.doubleClick(Z2).perform();
	WebElement Z3=z.findElement(By.xpath("//div[@id='draggable']"));
	WebElement Z4=z.findElement(By.xpath("//div[@id='droppable']"));
	d.dragAndDrop(Z3, Z4).perform();
	WebElement Z5=z.findElement(By.xpath("//img[@alt='the peaks of high tatras']"));
	WebElement Z6=z.findElement(By.xpath("//div[@id='trash']"));
	d.clickAndHold(Z5).moveToElement(Z6).build().perform();
	WebElement Z7=z.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	WebElement Z8=z.findElement(By.xpath("//div[@id='trash']"));
	d.clickAndHold(Z7).moveToElement(Z8).build().perform();
Thread.sleep(2000);
	WebElement k=z.findElement(By.xpath("(//div)[191]"));
	String path="C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\H.png";
	File F23=k.getScreenshotAs(OutputType.FILE);
	File io=new File(path);
	FileHandler.copy(F23, io);
	Thread.sleep(2000);
	z.findElement(By.xpath("//input[@id='age']")).sendKeys("85");
	String path1="C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\pk.png";
	File F231=((TakesScreenshot)z).getScreenshotAs(OutputType.FILE);
	File io1=new File(path1);
	FileHandler.copy(F231, io1);
}
public static void main(String[]args) throws InterruptedException, IOException {
	AllPractice r=new AllPractice();
	r.A1();
}
}


