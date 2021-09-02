package com.qa.pages;



import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditMyProfile extends BaseTest{


	@AndroidFindBy(id= "com.becon.ecom:id/name")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	
	private MobileElement pfName;
	
	@AndroidFindBy(id= "com.becon.ecom:id/email")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]")
	
	private MobileElement pfEmail;
	
	@AndroidFindBy(id= "com.becon.ecom:id/code")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[3]")
	
	private MobileElement pfCode;
	
	@AndroidFindBy(id= "com.becon.ecom:id/phone")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[4]")
	
	private MobileElement pfNumber;
	
	@AndroidFindBy(id= "com.becon.ecom:id/btn_update")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"UPDATE PROFILE\"]")
	
	private MobileElement updatepfBtn;

	
	public EditMyProfile profileName (String name)
	{
		clear(pfName);
		sendKeys(pfName, name);
		return this;
		
	}
	
	public EditMyProfile profileEmail (String email)
	{
		clear(pfEmail);
		sendKeys(pfEmail, email);
		return this;
		
	}
	
	public EditMyProfile profileCoutryCode (String code)
	{
		clear(pfCode);
		sendKeys(pfCode, code);
		return this;
		
	}
	
	public EditMyProfile profileNumber (String number)
	{
		clear(pfNumber);
		sendKeys(pfNumber, number);
		return this;
		
	}
	
	public EditMyProfile pressUpdateBtn ()
	{
		click(updatepfBtn);
		return this;
		
	}
}
