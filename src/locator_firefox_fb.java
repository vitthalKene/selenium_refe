

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_firefox_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(); 
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("11111");
		driver.findElement(By.name("pass")).sendKeys("1111");
		driver.findElement(By.name("login")).click();
	 
		
	}

}
