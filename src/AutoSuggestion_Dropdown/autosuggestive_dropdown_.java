package AutoSuggestion_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_dropdown_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("SQL Tutorial");     //taking input
		
		List<WebElement> text_webelement=driver.findElements(By.xpath("(//form[@class=\"example\"])/div/a[1]/span"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("(//form[@class=\"example\"])/div/a[1]"));      //create the object of text and click
		
		int count=text_webelement.size();   //find size of text box element
		
		for (int i=0; i<count; i++)
		{
			String list_value=text_webelement.get(i).getText();
			if (list_value.equalsIgnoreCase("SQL Tutorials"))
			{
				click_webelement.get(i).click();
			}
			else
			{
				System.out.println("Desired output is not found" +i+",hence retrying");
			}
		}
		
		driver.close();
		
		

	}

}
