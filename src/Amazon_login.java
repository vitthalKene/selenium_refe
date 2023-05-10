
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Amazon_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c);
		
		Actions Act=new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Act.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("8380938446");
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		driver.quit();

	}

}
