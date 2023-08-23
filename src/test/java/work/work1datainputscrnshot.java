package work;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class work1datainputscrnshot {
	WebDriver driver;
	By click=By.xpath("//*[@id=\"content\"]/ul/li[27]/a");
	By input=By.xpath("//*[@id=\"content\"]/div/div/div/input");
	
public void linkclick() {
	driver.findElement(click).click();
}

public work1datainputscrnshot(WebDriver driver) {
	this.driver=driver;
}
public void setvalue(String input ) {
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input")).sendKeys(input);
}
public void screensht() throws Exception  {
	File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(scr, new File("F:\\pics.png"));
}

}