package iframe_drag_drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ScreenRecorder\\SQL & UNIX\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Actions Act=new Actions(driver);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));   //switch the reliable frame
		
		WebElement source=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement destination=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		// drag and drop
		Act.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().parentFrame();   //switch to parent
	

	}

}
