package AutomateScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Automate_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.imdb.com/");
		
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File filename=new File("C:\\Users\\Vitthal\\OneDrive\\Pictures\\Screenshots\\.png");
		
		//TakesScreenshot srcShot=((TakesScreenshot) driver);  //convert WebDriver object into screenshot
		//File src=srcShot.getScreenshotAs(OutputType.FILE);
		
		if (filename.exists())
		{
			System.out.println("Screenshot Exists");
			//filename.delete();
			Files.copy(src, filename);
			System.out.println("["+filename+"] Copied in Dir");
		}
		else
		{
			System.out.println("Screenshot doest not Exists");
			Files.copy(src, filename);
			System.out.println("["+filename+"] Copied");
		
		}
		driver.quit();
		
	}
}
