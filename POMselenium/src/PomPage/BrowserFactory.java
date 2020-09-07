package PomPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {


	static String chrome="E:\\chromedriver.exe";
	static String url = "";
	
	
	public static  WebDriver startApplication(WebDriver driver, String browsername) throws Exception {

		if(browsername.equals("chrome")) {
			

			System.setProperty("webdriver.chrome.driver",chrome);
						
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
