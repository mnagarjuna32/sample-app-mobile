package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends BaseTest{
	TestUtils utils = new TestUtils();

	@iOSXCUITFindBy(id = "Allow Once")
	private MobileElement allowOnce;
	@iOSXCUITFindBy(id = "Allow")
	private MobileElement allow;

	@AndroidFindBy (id= "com.becon.ecom:id/nav_profile_main") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeTabBar[@name=\"Tab Bar\"]/XCUIElementTypeButton[4]")
	private MobileElement profileBtn; 
	
	@AndroidFindBy (id= "com.becon.ecom:id/btn_logout") 
	@iOSXCUITFindBy (iOSNsPredicate = "label == \"LOGIN\" AND name == \"LOGIN\" AND type == \"XCUIElementTypeButton\"")
	private MobileElement logBtn; 
//	@AndroidFindBy (xpath= "")private MobileElement profileScroll;
	

public HomePage pressAllowOnce()
{
	click(allowOnce);
	return new HomePage();
}

public HomePage pressAllow() {
	click(allow);
	return new HomePage();
}


public HomePage pressProfileBtn ()
{
	click(profileBtn);
	return new HomePage();
	
}
public LoginPage loginbtn()
{
	click(logBtn);
	return new LoginPage();
}





	
	

}
