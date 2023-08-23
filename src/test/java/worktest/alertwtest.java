package worktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.alert;

public class alertwtest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlload() {
		driver.get("https://the-internet.herokuapp.com/");
	}
	@Test
	public void test() {
		alert od=new alert(driver);
		od.click();
		od.alt();
	}

}
