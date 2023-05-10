

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_dropdown_yahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//set the properties 
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  //Create the of object of Driver
		
		driver.get("https://in.search.yahoo.com/?fr2=inr"); //Launch the URL
		
		driver.manage().window().maximize();  //maximize the Browser
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("selenium");  //Search box for what do u want to search
		Thread.sleep(5000);
		
		//Create the object of WebElement for Text and Click
		List<WebElement> text_webelement=driver.findElements(By.xpath("(//ul[@role=\"listbox\"])/li/span/b"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("(//ul[@role=\"listbox\"])/li/span"));
		
		//Fetch the count of list
		int count=text_webelement.size();
		
		//select the value depending on comparison
		for(int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			if(listvalue.equalsIgnoreCase("selenium"))
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
