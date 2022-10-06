package window_Handling;

public interface TestBase1 {
	String key1="webdriver.chrome.driver";
	String key2="webdriver.gecko.driver";
	String key3="webdriver.opera.driver";
	String key4="webdriver.edge.driver";

String Path1="C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe";
String Path2="C:\\velocityTraining\\setups\\Firefox_Driver\\geckodriver-v0.30.0-win64\\geckodriver.exe";
String Path3="C:\\velocityTraining\\setups\\OperaDriver\\operadriver_win64\\operadriver.exe";
String Path4="C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe";

static String url1="https://web.whatsapp.com/";
static String url2="https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=9528936372227321483&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiA6Y2QBhAtEiwAGHybPTm58Bcu3MFqu67XNaemA_zY8qz3LAAIZtep5gDPcjnSddnUFEL7wRoCo1oQAvD_BwE";
static String url3="https://www.google.com/search?q=fb+login&rlz=1C1GGRV_enIN978IN978&oq=fb&aqs=chrome.0.69i59j69i57j0i131i433i512l2j0i512j0i131i433j0i131i433i512l2j46i199i291i433i512.8439j0j4&sourceid=chrome&ie=UTF-8";


public abstract void launchChromedriver();
public abstract void launchFirefoxdriver();
public abstract void launchEdgwDriver();


}
