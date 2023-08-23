package worktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.dragdrop;

public class wtest2dragdrop {
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
public void drag() {
	dragdrop se=new dragdrop(driver);
	se.click();
	se.drop();
}
}
