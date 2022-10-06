package selenium_Company;

public class TestScenario_Title extends Launch_Browsers{
        static  String Exp_Title="WhatsApp_";
	public static void main(String [] args) throws InterruptedException {
		TestScenario_Title A =new TestScenario_Title();
		A.launchChromedriver();
		String ActTitle= d.getTitle();
		if(Exp_Title.equals(ActTitle)) {
			System.out.println("Test Scenario passed and Title is"+ActTitle);
		}
		else {
			System.out.println("Test Scenario failed. plese enter valid url");
		}
		Thread.sleep(3000);
		A.thankYou();
		d.close();
		
	}
}
