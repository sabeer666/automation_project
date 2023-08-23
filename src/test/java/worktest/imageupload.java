package worktest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class imageupload {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		
		
	}
	@BeforeMethod
	public void urlload() {
		driver.get("https://the-internet.herokuapp.com/upload");
	}
	@Test
	public void work() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		driver.findElement(By.id("file-upload")).sendKeys("F:\\pics\\jonsina.png");
		driver.findElement(By.id("file-submit")).submit();
		if(driver.getPageSource().contains("File Uploaded!")) {
			System.out.println("done");
			
		}
		else
		{
			System.out.println("not");
		}
		
	}
	}



