package selenium_Company;

public class Scenario_Firefox extends Launch_Browsers {
	static String Exp_Title="WhatsApp";
public static void main(String [] args) {
	Scenario_Firefox A =new Scenario_Firefox();
	A.launchFirefoxdriver();
	String Act_Title=d.getTitle();
	if(Exp_Title.equals(Act_Title)) {
	System.out.println("Test scenario passed Title is "+Act_Title);	
	}
	else {
		System.out.println("Test Failed Please enter valid url");
	}
	d.close();
	
}
}
