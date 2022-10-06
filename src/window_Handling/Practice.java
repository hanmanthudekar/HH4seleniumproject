package window_Handling;

import java.util.Set;

import org.openqa.selenium.By;

public class Practice extends Launch_Browsers{

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
			}
		}
		d.switchTo().window(ParentHandle);
	}
}