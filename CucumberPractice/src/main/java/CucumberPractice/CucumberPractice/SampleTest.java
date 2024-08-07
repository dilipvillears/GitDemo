package CucumberPractice.CucumberPractice;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeOptions options = new
		 * ChromeOptions(); options.addArguments("--remote-allow-origins=*"); driver =
		 * new ChromeDriver(options);
		 */
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		   
	}
	
	
	@Test
	public void googleSearch() {
		
		
		driver.get("https://www.google.com");
	}
	
	public void driverQuit() {
		
		driver.quit();
	}
	
	

}
