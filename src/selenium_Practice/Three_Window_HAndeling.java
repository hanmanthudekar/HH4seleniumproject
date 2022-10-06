package selenium_Practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Three_Window_HAndeling extends Launch_Browsers{

	public void practice() throws InterruptedException {
		Three_Window_HAndeling a = new Three_Window_HAndeling();
		a.Launch_Chrome();
		d.navigate().to("https://www.naukri.com/");
		String parent = d.getWindowHandle();
		System.out.println(parent);
		WebElement e1 = d.findElement(By.xpath("//div[@class='mTxt']"));
		e1.click();
		d.switchTo().window(parent);
		d.findElement(By.xpath("//a[@href='https://www.naukri.com/top-company-jobs']")).click();
		Set<String> childs = d.getWindowHandles();
		System.out.println(childs);
		for(String ch:childs) {
			if(!ch.equals(parent)) {
				d.switchTo().window(ch);
				System.out.println("switched to childs");
				if((d.getCurrentUrl()).equals("https://www.naukri.com/top-company-jobs")) {
					d.switchTo().window(ch);
					Thread.sleep(3000);
					System.out.println("switched to child 1");
					d.findElement(By.xpath("//input[@name='qp']")).sendKeys("Tester");
					d.switchTo().window(ch);
					Thread.sleep(3000);
				}
				if((d.getCurrentUrl()).equals("https://www.naukri.com/browse-jobs")) {
					System.out.println("switched to child 2");
					d.switchTo().window(ch);
					d.findElement(By.xpath("//input[@name='qp']")).sendKeys("Tester");
				}
			}
		}

	}
	public static void main(String [] args) throws InterruptedException {
		Three_Window_HAndeling s= new Three_Window_HAndeling();
		s.practice();
	}
}
