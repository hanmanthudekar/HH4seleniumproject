package selenium_Company;

public class Testurl extends Launch_Browsers {
static String Exp_url="https://web.whatsapp.com/";
public static void main(String[] args) {
	Testurl t=new Testurl();
	t.launchChromedriver();
	String Act_url=d.getCurrentUrl();
	if(Exp_url.equals(Act_url)) {
		System.out.println("Test Scenario passed url is "+Act_url);
	}
	else {
		System.out.println("Test Scenario passed url is "+Act_url);
	}
	d.close();
}
}
