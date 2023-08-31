package Assignmentproject2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmergencyContact {
	
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
	
	public void contact()
	{
		
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(submit)).click();
		driver.findElement(By.xpath("PMI")).click();
		driver.findElement(By.xpath("Add Employee")).click();
		driver.findElement(By.xpath("Emergencycontact")).click();
		driver.findElement(By.xpath("name")).sendKeys(properties.getProperty("ammu"));
		driver.findElement(By.xpath("relationship")).sendKeys(properties.getProperty("brother"));
		driver.findElement(By.xpath("hometele")).sendKeys(properties.getProperty("546258964"));
		driver.findElement(By.xpath("Mobile")).sendKeys(properties.getProperty("9736541235"));
		driver.findElement(By.xpath("worktele")).sendKeys(properties.getProperty("03452"));
		driver.findElement(By.xpath("save")).click();
	}

}
