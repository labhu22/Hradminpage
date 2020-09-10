package PomPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerfiyLoginPage {


	WebDriver driver;


	static String chrome="E:\\chromedriver.exe";
	static String url = "https://www.facebook.com/";

	@Test
	public void verify() {


		System.setProperty("webdriver.chrome.driver",chrome);
		driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("email")).sendKeys("singhaniyaraaz56@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("pujamishra");
		driver.findElement(By.name("login")).click();

		System.out.println("============Test case Passed excecuting ============");

	}

}

