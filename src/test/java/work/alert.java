package work;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alert {
WebDriver driver;
By alertclick=By.xpath("//*[@id=\"content\"]/ul/li[29]/a");
By alert=By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
public void click() {
	driver.findElement(alertclick).click();
}
public alert(WebDriver driver) {
	this.driver=driver;
}
public void alt() {
	driver.findElement(alert).click();
	Alert gh=driver.switchTo().alert();
	String text=gh.getText();
	if(text.equals("I am a JS Alert")) {
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
		
	}
	gh.accept();
}
}
