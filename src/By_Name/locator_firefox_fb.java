package By_Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator_firefox_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:\\MSSquare Global\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("11111");
		driver.findElement(By.name("pass")).sendKeys("1111");
		driver.findElement(By.name("login")).click();
	 
		
	}

}
