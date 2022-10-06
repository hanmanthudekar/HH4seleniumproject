package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe");
	WebDriver A=new EdgeDriver();
	A.get("https://www.bing.com/search?q=fb+login&cvid=53166f7c04954090b7c273caaf3b8dca&aqs=edge.2.69i57j0l8.3236j0j4&FORM=ANAB01&PC=U531");
}
}
