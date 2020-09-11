package PomPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActualTestcase {


	WebDriver driver;

	@Test
	public void verifyLoginPage( ) throws Exception{

		
		driver=BrowserFactory.startApplication(driver,"chrome");
		System.out.println(driver.getTitle());
		
		//Created Page Object using Page Factory 
		LoginPageNew Login_page= PageFactory.initElements(driver, LoginPageNew.class);

		//call the method

		Login_page.Login_page("sanjeetk@clariontechnologies.co.in", "clarion");

		//Click on Log Promise Link
		driver.findElement(By.xpath("//a[contains(text(),'Log Promise')]")).click();

		Thread.sleep(2000);

		Select promicor = new Select(driver.findElement(By.name("cboEmp")));
		promicor.selectByVisibleText("-- Select Promicor --");
		promicor.selectByValue("4FD8CA8F7257FFE0BF0D13098D160895");

		System.out.println("============promicor selected=============");
		Thread.sleep(1000);


		driver.findElement(By.id("txtPromise")).sendKeys("Promise test by priyanka selenium code12");

		// Click on Log Promise button

		driver.findElement(By.name("btnSubmit")).click();

		String actual_error= driver.findElement(By.xpath("//font[contains(text(),'Promise added successfully')]")).getAttribute("innerHTML");
		System.out.println(actual_error);
		String expected_error="Promise added successfully";		
		Assert.assertEquals(actual_error,expected_error);
		Thread.sleep(1000);


		Select promisor = new Select(driver.findElement(By.name("cboEmp")));
		promisor.selectByVisibleText("-- All Promisors --");
		promisor.selectByValue("4FD8CA8F7257FFE0BF0D13098D160895");

		System.out.println("============promisor  selected=============");
		Thread.sleep(1000);

		
		//Click on the search button and verify the Promise is added
		driver.findElement(By.name("btnSearch")).click();

		
		actual_error= driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td/table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]/b")).getAttribute("innerHTML");
		System.out.println(actual_error);
		expected_error="Promise";		
		Assert.assertEquals(actual_error,expected_error);
		Thread.sleep(2000);

		System.out.println("============Test case Passed============");

		
	}



}
