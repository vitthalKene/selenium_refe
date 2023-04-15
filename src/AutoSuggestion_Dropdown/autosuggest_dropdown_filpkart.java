package AutoSuggestion_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggest_dropdown_filpkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("mobile");
		Thread.sleep(2000);
		
		//create the WebElement variable for text and click
		List<WebElement> text_webelement=driver.findElements(By.xpath("(//li[@class=\"Y5N33s\"])/div/a/div[2]/span"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("(//li[@class=\"Y5N33s\"])/div/a/div[2]"));
		
		//fetch the count of list
		int count=text_webelement.size();
		
		//Iterate through entire list and select value depending on comparison
		for (int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			if (listvalue.equalsIgnoreCase("mobile"))
			{
				click_webelement.get(i).click();
				break;
			}
			else
			{
				System.out.println("desire value is not found in iteration"+i+",hence etrying");
			}
		
		}
		driver.quit();
		
	}

}
