

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class augosugg_dropdown_GOibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(c); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Launch the URL
		
		driver.close();

	}

}
