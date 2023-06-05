

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver(c); 
		
		Actions Act=new Actions(driver);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));   //switch the reliable frame
		
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement destination=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		// drag and drop
		Act.dragAndDrop(source, destination).build().perform();
		
		//driver.switchTo().parentFrame();   //switch to parent
	

	}

}
