import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		//System.setProperty( "webdriver.gecko.driver", "H:\\JAVA\\JAVA Projects\\SeleniumTest\\library\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin", "C:\\Users\\GAJA\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://selenium.dev/");
		driver.quit();
			
	}
}
