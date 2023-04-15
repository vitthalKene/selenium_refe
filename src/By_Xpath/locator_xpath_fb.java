package By_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver","D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("8380938446");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Vitthal198@");
		driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
		


	}

}
