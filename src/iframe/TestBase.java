package iframe;

import java.io.IOException;

public interface TestBase {
	String key1="webdriver.chrome.driver";
	String Path1="C:\\velocityTraining\\setups\\Chrome_Driver.98\\chromedriver_win32\\chromedriver.exe";

	public void launch_Chrome() throws IOException, Exception;
}
