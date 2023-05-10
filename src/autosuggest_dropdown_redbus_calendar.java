

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggest_dropdown_redbus_calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        ChromeOptions c=new ChromeOptions();
        c.addArguments("--remote-allow-origins=*");
        
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c);
		
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()=\"Accept All\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).sendKeys("27");
		

		
		//create the WebElement variable for text and click
		List<WebElement> text_webelement=driver.findElements(By.xpath("//div[contains(@class,\"DayTiles__CalendarDays\")]/span"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("//div[contains(@class,\"DayTiles__CalendarDays\")]"));
		
		//fetch the count of list
		int count=text_webelement.size();
		
		//Iterate through entire list and select value depending on comparison
		for (int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			if(listvalue.equalsIgnoreCase("27"))
			{
				click_webelement.get(i).click();
			}
			else
			{
				System.out.println("desire value is not found in iteration"+i+",hence etrying");
			}
		}
	

	}

}
