package Assignmentproject2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jobsalary {
	
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
	 public void salary() {
		 
		 driver.get(properties.getProperty("url"));
			driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
			driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
			driver.findElement(By.xpath(submit)).click();
			driver.findElement(By.xpath("PMI")).click();
			driver.findElement(By.xpath("Add Employee")).click();
			driver.findElement(By.xpath("salary")).click();
			driver.findElement(By.xpath("salarycomponent")).sendKeys(properties.getProperty("100000"));
			driver.findElement(By.xpath("paygrade")).sendKeys(properties.getProperty("grade1"));
			driver.findElement(By.xpath("payfrequency")).sendKeys(properties.getProperty("monthly"));
			driver.findElement(By.xpath("currency")).sendKeys(properties.getProperty("india"));
			driver.findElement(By.xpath("pimamoumt")).sendKeys(properties.getProperty("10000"));
			driver.findElement(By.xpath("save")).click();
	 }

}
