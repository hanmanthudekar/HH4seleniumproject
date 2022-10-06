package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Practice implements TestBase {

	public void launch_Chrome() {
		System.setProperty(key1, Path1);
		WebDriver a= new ChromeDriver();
		a.manage().window().maximize();
		a.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		a.findElement(By.id("name")).sendKeys("Hanmant");
		a.switchTo().frame("frm1");
		a.findElement(By.id("selectnav1")).click();
	}
	
	public static void main(String [] args) {
		Frames_Practice b= new Frames_Practice();
		b.launch_Chrome();
	}
}
