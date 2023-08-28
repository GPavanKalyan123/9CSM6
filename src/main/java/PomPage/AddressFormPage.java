package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibraries.WebDriverUtility;

public abstract class AddressFormPage {
	@FindBy(id="Name")
	private WebElement nameTF;
	@FindBy(id="House/Office Info")
	private WebElement houseInfoTF;
	@FindBy(id="Street Info")
	private WebElement streetInfoTF;
	@FindBy(id="Landmark")
	private WebElement  landMarkInfoTF;
	@FindBy(id="Country")
	private WebElement countryDropdown;
	@FindBy(id="State")
	private WebElement stateDropDown;
	@FindBy(id="City")
	private WebElement cityDropDown;
	@FindBy(id="Pincode")
	private WebElement pincodeTF;
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTF;
	@FindBy(xpath="//button[text()='Add Address']")	
	private WebElement addAddressButton;
	
	//Initilization
	 
	public AddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void addAddressDetials( WebDriverUtility web,String name,String houseInfo,String streetInfo,String landMark,String country,String state,String city,String pincode,String phoneNum)
	{
		nameTF.sendKeys(name);
		houseInfoTF.sendKeys(houseInfo);
		streetInfoTF.sendKeys(streetInfo);
		landMarkInfoTF.sendKeys(landMark);
		
		web.selectFromDropdown(country,countryDropdown);
		web.selectFromDropdown(state,stateDropDown);
		web.selectFromDropdown(city,cityDropDown);
		pincodeTF.sendKeys(pincode);
		phoneNumberTF.sendKeys(phoneNum);
		addAddressButton.click();
		
		
		
		
		
		
	}
	
	
}
