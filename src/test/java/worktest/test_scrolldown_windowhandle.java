package worktest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.scrolldown_windowhandle;

public class test_scrolldown_windowhandle {
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
public void scrolln() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)", " ");
	}
@Test
public void fullwindow() {
	scrolldown_windowhandle op=new scrolldown_windowhandle(driver);
	op.click();
	op.windowsh();
}
}
