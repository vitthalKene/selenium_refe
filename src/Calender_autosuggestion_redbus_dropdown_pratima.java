

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_autosuggestion_redbus_dropdown_pratima {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Input Date from user
		Scanner s=new Scanner(System.in);
		String year, month, date;
		
		System.out.print("Enter year which want to search :  ");
		year = s.nextLine();
		
		System.out.print("Enter month which want to search: ");
		month= s.nextLine();
		
		System.out.print("Enter Date which want to search: ");
		date= s.nextLine();
		
		
		
		//Set the system properties
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c);  //create the object for browser
		
		driver.get("https://www.redbus.in/"); // launch the url
		
		driver.manage().window().maximize(); // maximize the browser
		
		driver.findElement(By.xpath("//input[@id=\"onward_cal\"]")).click(); //create the web element variable for text and click 
		Thread.sleep(2000);
		
		while (true)
		{
			String monthyear=driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
			System.out.println(monthyear);
			
			String slicearray[] =monthyear.split(" ");
			String slicemonth= slicearray[0];
			String sliceyear=slicearray[1];
			
			if (slicemonth.equalsIgnoreCase(month) && sliceyear.equalsIgnoreCase(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//td[@class=\"next\"]/button")).click();
			}
		}
		
		//search the date
		List<WebElement> text_webelement=driver.findElements(By.xpath("//td[@class=\"wd day\" or @class=\"current day\"]"));
		List<WebElement> click_webelement=driver.findElements(By.xpath("//td[@class=\"wd day\" or @class=\"current day\"]"));
		
		//fetch the count
		int count=text_webelement.size();
		
		for(int i=0; i<count; i++)
		{
			String listvalue=text_webelement.get(i).getText();
			System.out.println(listvalue);
			if(listvalue.equals(date))
			{
				click_webelement.get(i).click();
				break;
			}
			else
			{
				System.out.println("Desired date is not found" +i+ "hence retrying");
			}
		}
		driver.quit();

	
	}

}
