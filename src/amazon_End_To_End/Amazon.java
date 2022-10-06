package amazon_End_To_End;

import java.util.Set;

import org.openqa.selenium.By;

public class Amazon extends Launch_Browsers {

	public static void main(String [] args) throws InterruptedException  {
		Amazon a =new Amazon();
		a.launchChromeDriver();
		d.navigate().to("https://www.amazon.in/gp/new-releases/?ref_=nav_cs_newreleases");
		d.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		String P1=	d.getWindowHandle();
		System.out.println(P1);
		d.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_em_cs_bestsellers_0_1_1_2']")).click();
		Set<String> Child = d.getWindowHandles();
		System.out.println(Child);
		d.navigate().forward();
		d.findElement(By.xpath("//a[@href='/gp/most-wished-for/ref=zg_bs_tab']")).click();
		Thread.sleep(3000);
		//d.quit();
	}
}
