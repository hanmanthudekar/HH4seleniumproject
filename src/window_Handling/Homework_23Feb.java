package window_Handling;

import java.util.Set;

import org.openqa.selenium.By;

public class Homework_23Feb extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		Homework_23Feb a = new Homework_23Feb();
		a.launchChromedriver();
		d.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		String ParentHandle=d.getWindowHandle();
		System.out.println(ParentHandle);
		d.findElement(By.name("link1")).click();
		Set<String> ChildHandle=d.getWindowHandles();
		System.out.println(ChildHandle);
		for(String ch1:ChildHandle) {
			if(!ch1.equals(ParentHandle)) {
				d.switchTo().window(ch1);
				d.findElement(By.name("q")).sendKeys("Velocity Corporate Training center pune");
				Thread.sleep(4000);
				d.findElement(By.xpath("//input[1][@value='Google Search']")).click();
				d.close();
			}
		}
		d.switchTo().window(ParentHandle);
		d.findElement(By.className("post-count-link")).click();
		d.navigate().back();
		d.findElement(By.xpath("//a[2][@target='_blank']")).click();
		Set<String> ChildHandles2=d.getWindowHandles();
		System.out.println(ChildHandles2);
		for(String ch2:ChildHandles2) {
			if(!ch2.equals(ParentHandle)) {
				d.switchTo().window(ch2);
				d.findElement(By.xpath("//input[@id='email']")).sendKeys("8975015726");
				d.findElement(By.xpath("//input[@name='pass']")).sendKeys("Hanmant@7245H");
				d.findElement(By.xpath("//button[@name='login']")).click();
				Thread.sleep(3000);
				d.close();
			}
		}
		d.switchTo().window(ParentHandle);
		d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2021/']")).click();
		d.navigate().back();
		Thread.sleep(2000);
		d.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
		Set<String > Chield3= d.getWindowHandles();
		System.out.println(Chield3);
		for(String ch3:Chield3) {
			if(!ch3.equals(ParentHandle)) {
				d.switchTo().window(ch3);
				d.findElement(By.id("yschsp")).sendKeys("Testing Jobs");
				Thread.sleep(3000);
				d.close();
			}
		}
		d.switchTo().window(ParentHandle);
		d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2019/']")).click();
		d.navigate().back();
		d.findElement(By.xpath("//a[4]")).click();
		Thread.sleep(3000);
		d.navigate().back();
		d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2018/']")).click();
		Thread.sleep(3000);
		d.navigate().back();
		Thread.sleep(3000);
		d.quit();
	}
}

