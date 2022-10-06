package selenium_Company;

import org.openqa.selenium.By;

public class Myntra_Signup_Testing extends Launch_Browsers{
	
	
	public static void main(String [] args) {
	
	
	Myntra_Signup_Testing a=new Myntra_Signup_Testing();
	a.launchChromedriver();
	d.navigate().to("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIwMXMgJGB9gIVb5JmAh08VAgYEAAYASAAEgIM7PD_BwE");
	d.findElement(By.id("headerInput")).sendKeys("watches");
}
}