package AutoSuggestion_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf\"]")).sendKeys("sikkim");
		Thread.sleep(2000);
		
		//create the WebElement variable for text and click
		List<WebElement> text_webelement=driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]/li/div/div[2]/div/span"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]/li/div/div[2]/div"));
		
		//fetch the count of list 
		int count=text_webelement.size();
		
		//iterate through entire list and select value depending on comparison
		for (int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			if (listvalue.equalsIgnoreCase("sikkim"))
			{
				click_webelement.get(i).click();
			}
			else
			{
				System.out.println("Enter the disire value"+i+"hence retrying");
				
			}
		}
		driver.quit();

	}

}
