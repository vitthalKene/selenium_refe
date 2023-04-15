package common;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_common_method {

	public class All_common_methods {
		public static WebDriver driver=null;
		
	public static void getChromeDriver (String URL) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shital milind sthul\\OneDrive\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public static void getEdgeDriver(String URL) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\shital milind sthul\\OneDrive\\Documents\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public static void getFireFoxDriver(String URL) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\shital milind sthul\\OneDrive\\Documents\\Firefox Installer.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(URL);
		driver.manage().window().maximize();
	}
	public static void getWebelementByXpath(String element) {
		driver.findElement(By.xpath(element)).click();
	}

	public static void getExpWait(String webelement) {
		WebDriverWait explicit_wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		explicit_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webelement))).click();
	}
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	public static void closewindow() {
		driver.quit();
	}

	}


}
