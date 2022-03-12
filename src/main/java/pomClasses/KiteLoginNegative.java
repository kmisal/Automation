package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginNegative {
	//Declaration
	
	@FindBy(xpath="//input[@id='email']") private WebElement uId;
	
	@FindBy(xpath="//input[@id='pass']") private WebElement pwd;
	
	@FindBy(xpath="//button[@name='login']") private WebElement btn;
	
	

	
	
	//usage
	public void setUserId(String uname) {
		uId.sendKeys(uname);
		
	}
	
	public void setPassword(String pass) {
		pwd.sendKeys(pass);
	}
	
	
	public void clickLoginBtn() {
		btn.click();
	}
	
	
	
}
