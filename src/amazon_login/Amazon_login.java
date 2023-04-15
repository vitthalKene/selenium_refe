package amazon_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions Act=new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		
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
