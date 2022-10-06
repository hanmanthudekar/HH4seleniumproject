package selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumPractice {

	static WebDriver driver;

	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver","C:\\velocityTraining\\setups\\Microsoft_Edge\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		String ExpectedTitle = "Facebook – log in or sign u";

		String actualTitle = driver.getTitle();
		if(ExpectedTitle.equals(actualTitle)) {
			System.out.println("Test scenario pased Title is validated succesfully..");
		}
		else {
			System.out.println("Test scenario failed.");
		}
		driver.quit();
	}

}
