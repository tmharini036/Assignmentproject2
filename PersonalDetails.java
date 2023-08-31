package Assignmentproject2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalDetails {
	
	private WebDriver driver;
	private Properties properties;
	private String chromeDriverPath;
	private String submit;

	public void setUp() throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:/Users/Harini T M/eclipse-workspace/daily/src/test/java/Assignmentproject2/employeedta.properties");
		prop.load(ip);
		 System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}
	
	public void personal() {
		
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(submit)).click();
		driver.findElement(By.xpath("PMI")).click();
		driver.findElement(By.xpath("Add Employee")).click();
		driver.findElement(By.xpath("personaldetails")).click();
		driver.findElement(By.xpath("fullname")).sendKeys(properties.getProperty("ammu"));
		driver.findElement(By.xpath("lastname")).sendKeys(properties.getProperty("l"));
		driver.findElement(By.xpath("nickname")).sendKeys(properties.getProperty("anu"));
		driver.findElement(By.xpath("empid")).sendKeys(properties.getProperty("0398"));
		driver.findElement(By.xpath("otherid")).sendKeys(properties.getProperty("03452"));
		driver.findElement(By.xpath("driverlicence")).sendKeys(properties.getProperty("BDDhg67543"));
		driver.findElement(By.xpath("expirydate")).sendKeys(properties.getProperty("25-08-2023"));
		driver.findElement(By.xpath("SSNNum")).sendKeys(properties.getProperty("435234"));
		driver.findElement(By.xpath("SINNum")).sendKeys(properties.getProperty("6745637"));
		driver.findElement(By.xpath("nation")).sendKeys(properties.getProperty("india"));
		driver.findElement(By.xpath("maritalstatus")).sendKeys(properties.getProperty("Female"));
		driver.findElement(By.xpath("save")).click();
		
	}

}
