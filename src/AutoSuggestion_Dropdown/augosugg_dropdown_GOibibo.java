package AutoSuggestion_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class augosugg_dropdown_GOibibo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set the properties 
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();  //Create the of object of Driver
				
		driver.get("https://www.goibibo.com/"); //Launch the URL
				
		driver.manage().window().maximize();  //maximize the Browser
		
		driver.findElement(By.xpath("//p[@class=\"sc-bBHxTw hqJqrJ fswWidgetPlaceholder\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Pune");
		Thread.sleep(2000);
		
		//create the object of WebElement for text and click
		List<WebElement> text_webelement=driver.findElements(By.xpath("(//ul[@id=\"autoSuggest-list\"])/li/div/div[1]/div/p/span[1]"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("(//ul[@id=\"autoSuggest-list\"])/li/div/div[1]/div/p"));
		
		//fetch the count
		int count=text_webelement.size();
		
		//select the value depending on comparison
		for(int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			if(listvalue.contains("Pune"))
			{
				click_webelement.get(i).click();
				break;
			}
			else
			{
				System.out.println("desire value is not found in iteration"+i+",hence etrying");
			}
			
		}
		
		driver.close();
		

	}

}
