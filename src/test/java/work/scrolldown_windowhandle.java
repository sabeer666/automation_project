package work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class scrolldown_windowhandle {
	WebDriver driver;
	By handle=By.xpath("//*[@id=\"content\"]/ul/li[33]/a");
	By usehandle=By.xpath("//*[@id=\"content\"]/div/a");
	public void click() {
		driver.findElement(handle).click();
		
	}
	public scrolldown_windowhandle(WebDriver driver) {
		this.driver=driver;
		
	}
	public void windowsh() {
		driver.findElement(usehandle).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title"+driver.getTitle());
	
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com");
		
		
		
	
	}

}
