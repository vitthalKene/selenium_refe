

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_xpath_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("8380938446");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Vitthal198@");
		driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
		


	}

}
