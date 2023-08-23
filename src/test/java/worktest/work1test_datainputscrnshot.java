package worktest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import work.work1datainputscrnshot;

public class work1test_datainputscrnshot {
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
public void lettest() throws Exception {
	work1datainputscrnshot oa=new work1datainputscrnshot(driver);
	oa.linkclick();
	oa.setvalue("123");
	oa.screensht();
}


}
