package By_ID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locator_chrome_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set the System properties of driver and location
		
		
		//WebDriver driver=new ChromeDriver();   //Create the object of driver
		
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		
		driver.get("https://www.facebook.com/login/");   //fetch the URL
		
		driver.manage().window().maximize();   //maximize the browser
		
		//Send the values through web element 
		//driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("Roman art",Keys.ENTER);
		driver.findElement(By.id("email")).sendKeys("1");
		driver.findElement(By.id("pass")).sendKeys("8380938446");
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
