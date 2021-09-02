package com.qa.pages;



import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ContactUs extends BaseTest {
	
	@AndroidFindBy (id = "com.becon.ecom:id/name" )
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	
	private static MobileElement cName;
	
	@AndroidFindBy (id = "com.becon.ecom:id/email" )
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]")
	
	private static MobileElement cEmail;
	

	@AndroidFindBy (id = "com.becon.ecom:id/code" )
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[3]")
	
	private static MobileElement cCountrycode;
	
	@AndroidFindBy (id = "com.becon.ecom:id/phone" )
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField[4]")
	
	private static MobileElement cMobileNumber;
	
	@AndroidFindBy (id = "com.becon.ecom:id/msg" )
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextView")
	
	private static MobileElement cMsg;
	
	
	@AndroidFindBy (id = "com.becon.ecom:id/btn_send" )
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SEND MESSAGE\"]")
	
	private static MobileElement sendMsgBtn;
	
	
	public ContactUs pressSendMsgBtn()
	{
		click(sendMsgBtn);
		return new ContactUs();
	}
	public ContactUs enterContactName(String name)
	{
		sendKeys(cName, name);
		return this;
	}
	public ContactUs enterContactEmail(String email)
	{
		sendKeys(cEmail, email);
		return this;
	}
	public ContactUs enterCountrycode(String code)
	{
		sendKeys(cCountrycode, code);
		return this;
	}
	public ContactUs enterContactNumber(String mobilenumber)
	{
		sendKeys(cMobileNumber, mobilenumber);
		return this;
	}
	public ContactUs enterMsg(String query)
	{
		sendKeys(cMsg, query);
		return this;
	}
	
}
