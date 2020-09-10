package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {
WebDriver driver;
	
	public LoginPageNew(WebDriver driver) {
	
	this.driver=driver;
	
}

	@FindBy(name="txtUsername") 
	
	WebElement username;
	
    @FindBy(how=How.NAME,using ="txtPassword") 
	
	WebElement Password;
    
    
    @FindBy(how=How.NAME,using ="submit1") 

	WebElement ClickButton;

	public void Login_page(String uname, String pass) {
		
		username.sendKeys(uname);
		Password.sendKeys(pass);
		ClickButton.click();
		
	}
	
}
