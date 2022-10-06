package selenium_Company;

import org.openqa.selenium.By;

public class Amazon_Signup extends Launch_Browsers {

	public static void main(String [] args) {
	
		Launch_Browsers a = new Launch_Browsers();
		a.launchChromedriver();
		d.navigate().to("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58075519359%26hvpone%3D%26hvptwo%3D%26hvadid%3D486462756374%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D15807720524695192840%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007786%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2154371%26gclid%3DEAIaIQobChMIlbOfo-eI9gIV857CCh3p1AQlEAAYASAAEgK_oPD_BwE&prevRID=1TRQDTD8MTHWR9E9BZY5&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    d.findElement(By.xpath("//input[contains(@name,'customerName')]")).sendKeys("Hanmant");
	    d.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("8975015726");
	    d.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("58536vbz");
	    d.findElement(By.xpath("//input[contains(@name,'passwordCheck')]")).sendKeys("58536vbz");
	    d.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
	}
}
