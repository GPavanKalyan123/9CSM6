package PomPage;

import java.util.Map;

public class AddAddressTest extends BaseClass{
	@Test
	public void addAddressTest() {
		Map<String,String> map = excel.getData("Sheet1","Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"),map.get("Password"));
		Thread.sleep(2000);
		home.clickProfileButton();
		Thread.sleep(2000);
		myprofile.clickMyAddresses();
		myAddress.clickAddAddresses();
		address.addAddressDetails(webUtil,map);
		Thread.sleep(2000);
		Assert.assertEquals(myAddress.getSuccessMessage(),"successfully added");
		Thread.sleep(5000);
		
	}

}
