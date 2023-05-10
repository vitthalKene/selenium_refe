

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class static_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(c); 
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//create the object of select class.
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		
		Select s=new Select(dropdown);
		
		s.selectByIndex(1);
		//s.selectByVisibleText("Appliances");
		//s.selectByValue("search-alias=stripbooks");  
		
	

	}

}
