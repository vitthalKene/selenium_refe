

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggest_dropdown_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(c); 
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//testarea[@class=\"gLFyf\"]")).sendKeys("Goa");
		Thread.sleep(5000);

		
		//create the WebElement variable for text and click
		List<WebElement> text_webelement=driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]/li/div/div[2]/div[1]/span"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("(//ul[@jsname=\"bw4e9b\"])[1]/li/div/div[2]/div[1]"));
		
		//fetch the count of list
		int count=text_webelement.size();
		
		//Iterate through entire list and select value depending on comparison
		for (int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			if(listvalue.equalsIgnoreCase("Goa"))
			{
				click_webelement.get(i).click();
			}
			else
			{
				System.out.println("desire value is not found in iteration"+i+",hence etrying");
			}
		}
		driver.quit();
		

	}

}
