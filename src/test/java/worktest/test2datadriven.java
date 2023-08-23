package worktest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test2datadriven {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlload() {
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[20]/a")).click();
		
	}
	@Test
	
	
	public void main() throws IOException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		File f=new File("D:\\New folder (2)\\Book2.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
	for(int i=0;i<sh.getLastRowNum();i++)
	{
	String email=sh.getRow(i).getCell(0).getStringCellValue();
	System.out.println("email="+email);

	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);

	driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i")).click();
	String actual=driver.getCurrentUrl();
	System.out.println(actual);
	String expurl=" https://the-internet.herokuapp.com/forgot_password";
	if(expurl.equals(actual)) {
	System.out.println("login sucessful");
	}
	else
	{
	System.out.println("login faild");
	}

	}
	}
	}
	



