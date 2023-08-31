package Assignmentproject2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class employeeconfig {
	
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
	
	public void config() {
		
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath(submit)).click();
		driver.findElement(By.xpath("PMI")).click();
		driver.findElement(By.xpath("Add Employee")).click();
		driver.findElement(By.name("name1")).sendKeys(properties.getProperty("firstName"));
		driver.findElement(By.name("name2")).sendKeys(properties.getProperty("middleName"));
		driver.findElement(By.name("name3")).sendKeys(properties.getProperty("lastName"));
		driver.findElement(By.xpath("EmployeeID")).click();
		driver.findElement(By.xpath("logindetails")).isEnabled();
		driver.findElement(By.xpath("uname")).sendKeys(properties.getProperty("Admin"));
		driver.findElement(By.xpath("pwd")).sendKeys(properties.getProperty("admin123"));
		driver.findElement(By.xpath("cpwd")).sendKeys(properties.getProperty("admin123"));
		driver.findElement(By.xpath("save")).click();
	}

}
