package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Driver {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "C:\\velocityTraining\\setups\\Internet_explorer\\IEDriverServer.exe");
	WebDriver A=new InternetExplorerDriver();
	A.get("https://www.bing.com/search?q=whatsapp+web&src=IE-SearchBox&FORM=IESR4A&pc=EUPP_");
	A.navigate().to("https://www.amazon.in/ref=as_li_ss_tl?ie=UTF8&linkCode=ll2&tag=enin-edge-topsites-curate-ana-21&linkId=fbedcb44d04a4bae8eae32722a2f41c2&language=en_IN");
}
}
