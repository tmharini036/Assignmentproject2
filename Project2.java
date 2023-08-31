package Assignmentproject2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Project2 {
	
	
	private WebDriver driver;
	private Properties properties;
	private String chromeDriverPath;

	public void setUp() throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/Harini T M/eclipse-workspace/daily/src/test/java/Assignmentproject2/Config.properties");
		prop.load(ip);
		 System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}
	
	@Test
	
	public void usingHRM() {
		properties.getProperty("url");
		String submit = properties.getProperty("submit");
		
		
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(submit)).click();
		

	}

}
