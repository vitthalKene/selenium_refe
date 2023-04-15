package static_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class static_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//create the object of select class.
		WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		
		Select s=new Select(dropdown);
		
		//s.selectByIndex(1);
		//s.selectByVisibleText("Beauty");
		s.selectByValue("search-alias=stripbooks");  
		
		driver.quit();

	}

}
