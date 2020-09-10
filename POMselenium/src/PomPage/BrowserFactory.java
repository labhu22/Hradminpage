package PomPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
	
	static String chrome="E:\\chromedriver.exe";
	static String url = "http://182.74.238.221/clarion_promise_qa/index.php";
		
	public static  WebDriver startApplication(WebDriver driver, String browsername) throws Exception {

		if(browsername.equals("chrome")) {
			
		     System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

			System.setProperty("webdriver.chrome.driver",chrome);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--no-sandbox");
			
		
			//driver = new ChromeDriver(chromeOptions);
			
			driver=new ChromeDriver();
			
	    	
		}
		else {
			System.out.println("we do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get(url);
	   
    	
		return driver;
		
		
    	
	
	}

}

