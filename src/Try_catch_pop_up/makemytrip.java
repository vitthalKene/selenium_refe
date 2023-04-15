package Try_catch_pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
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
