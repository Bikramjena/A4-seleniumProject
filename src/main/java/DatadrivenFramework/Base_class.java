package DatadrivenFramework;

import org.apache.logging.log4j.util.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base_class {
	WebDriver driver=null;
	SeleniumUtility SUTIL=null;
	JavaUtility PUTIL=new JavaUtility();
	@BeforeSuite()
	public void createConnection() {
		System.out.println("Connection successful");
	}
	@BeforeClass()
	public void lunchBraswer() {
		String URL=PUTIL.getDataFromProperties("url");
		SUTIL=new SeleniumUtility();
		driver=new ChromeDriver();
		SUTIL.implicitwait(10);
		SUTIL.maximizeWindow();
		driver.get(URL);
		System.out.println("lunching successful");
		
	}
}
