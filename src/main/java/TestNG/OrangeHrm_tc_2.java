package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm_tc_2 {
	public String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.out.println("before Test executed");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void loginTest() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		String pageTitle=driver.getTitle();
		if(pageTitle.equals("OrangeHRM")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login failed");
		}
	}
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}


