package selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice extends Launch_Browsers{
	static Practice a = new Practice();
	public void All_locators() throws InterruptedException, IOException {
		a.Launch_Chrome();
		d.navigate().to("https://www.facebook.com/r.php");
		d.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Hanmant");
		d.findElement(By.name("lastname")).sendKeys("Hudekar");
		d.findElement(By.name("reg_email__")).sendKeys("8975015726");
		d.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Hanmant63763");
		WebElement day=d.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
		WebElement month=d.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year=d.findElement(By.xpath("//select[@title='Year']"));
		Select s1= new Select(day);
		s1.selectByIndex(7);
		Select s2= new Select(month);
		s2.selectByValue("8");
		Select s3= new Select(year);
		s3.selectByVisibleText("1998");
		d.findElement(By.xpath("//input[@value='2']")).click();
	//	d.findElement(By.xpath("//button[@name='websubmit']")).click();
	//d.findElement(By.linkText("Already have an account?")).click();
		d.findElement(By.partialLinkText("have")).click();
		WebElement f=d.findElement(By.xpath("//img[@class='_97vu img']"));
	File src=f.getScreenshotAs(OutputType.FILE);
		File f1= new File("C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Fb.png");
		FileHandler.copy(src, f1);
		File f2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		File src2=new File("C:\\velocityTraining\\setups\\Screenshot_From_Selenium\\Fb_page.png");
		FileHandler.copy(f2,src2);
		Thread.sleep(9000);
		d.quit();
	}
	public void set_Size() throws InterruptedException {
		Dimension d1=new Dimension(300,800);
		a.Launch_Chrome();
		d.navigate().to("https://www.facebook.com/r.php");
		d.manage().window().setSize(d1);
		Point p=new Point(100,400);
		d.manage().window().setPosition(p);
		Thread.sleep(9000);
		d.quit();
	}
	public void position() {
		a.Launch_Chrome();
		d.navigate().to("https://www.facebook.com/r.php");
	}
	public static void main(String [] args) throws InterruptedException, IOException {
		//a.All_locators();
		a.set_Size();
	}
}
