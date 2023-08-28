package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage {
	
	//Declaration
	
	@FindBy (xpath="//div[text()='My Addresses']")
	private WebElement myAddressesLink;
	
	//Intilization
	
	public MyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickMyAddresses()
	{
		myAddressesLink.click();

}
}
