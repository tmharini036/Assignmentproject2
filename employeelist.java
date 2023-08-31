package Assignmentproject2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class employeelist {
	
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
	
	public void list() {
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(submit)).click();
		driver.findElement(By.xpath("PMI")).click();
		driver.findElement(By.xpath("Add Employee")).click();
		driver.findElement(By.xpath("employeelist")).click();
		driver.findElement(By.xpath("employeename")).sendKeys(properties.getProperty("ammu"));
		driver.findElement(By.xpath("employeeid")).sendKeys(properties.getProperty("brother"));
		driver.findElement(By.xpath("employementstaus")).sendKeys(properties.getProperty("fulltime-contract"));
		driver.findElement(By.xpath("currentemployeeonly")).sendKeys(properties.getProperty("past employees only"));
		driver.findElement(By.xpath("supervisorname")).sendKeys(properties.getProperty("Harini"));
		driver.findElement(By.xpath("save")).click();
	}

}
