package work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	WebDriver driver;
	By touch=By.xpath("//*[@id=\"content\"]/ul/li[10]/a");
	


public void click() {
	driver.findElement(touch).click();
	
}
public dragdrop(WebDriver driver) {
	this.driver=driver;
	
}
public void drop() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	WebElement dr=driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
	WebElement cr=driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	act.dragAndDrop(dr, cr);
	act.perform();
	
	
	
}
}