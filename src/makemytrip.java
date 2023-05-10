

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c);
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//(//span[@class="nav-line-2"])[1]
		
		try
		{
			driver.findElement(By.xpath("//p[text()='Login/Signup for Best Prices']"));
			driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Pop up not displayed");
		}
		
		

	}

}
