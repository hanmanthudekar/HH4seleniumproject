package selenium_Company;

import org.openqa.selenium.By;

public class Fb_signup extends Launch_Browsers{
public static void main(String [] args) {
	Launch_Browsers A=new Launch_Browsers();
	A.launchChromedriver();
    d.navigate().to("https://meet.google.com/vbn-hkpi-ehs");
    d.findElement(By.xpath("//button[@class='VfPpkd-Bz112c-LgbsSe yHy1rc eT1oJ tWDL4c uaILN JxICCe CdgDHf HNeRed']")).click();
}
}
