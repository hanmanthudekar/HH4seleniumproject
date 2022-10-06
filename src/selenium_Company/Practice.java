package selenium_Company;

public class Practice extends Launch_Browsers{

	public static void main(String [] args) throws InterruptedException {
		String Exp_Title="WhatsApp";
		String Exp_Url="https://web.whatsapp.com";
		Launch_Browsers a =new Launch_Browsers();
		a.launchChromedriver();
        d.navigate().to(url1);
        String Act_Url=d.getCurrentUrl();
	    String Act_Title=d.getTitle();
	    if(Act_Url.equals(Exp_Url)) {
	    	if(Act_Title.equals(Exp_Title)) {
	    	System.out.println("Test Scenario passed Title is "+Act_Title+"And Url is "+Act_Url);
	    }
	    	else {
	    		System.out.print("Url is validated but Title does not matching ");
	    	}
	    }
	    else {
	    	System.out.println("Test Failed ");
	    }
	    d.close();
	}
	
}
