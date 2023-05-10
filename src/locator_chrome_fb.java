

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_chrome_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login/");   //fetch the URL
		
		driver.manage().window().maximize();   //maximize the browser
		
		//Send the values through web element 
		driver.findElement(By.xpath("//input[@id=\"email\"]"));
		driver.findElement(By.id("email")).sendKeys("8380938446");
		driver.findElement(By.id("pass")).sendKeys("8380938446");
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
