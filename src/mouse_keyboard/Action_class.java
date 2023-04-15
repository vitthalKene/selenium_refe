package mouse_keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//Creating the object for action class
		Actions act=new Actions(driver);
		
		//Mouse over
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).build().perform();
		
		//upper case into search box
		//act.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").build().perform();
		
		//right click
		//act.moveToElement(driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"))).contextClick().build().perform();
		
		//Double click
		//act.moveToElement(driver.findElement(By.xpath("(//span[text()='All'])[2]"))).doubleClick().build().perform();
	
		
	}

}
