package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyAccountPage extends BaseTest
{
	
//	@AndroidFindBy  (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView") private MobileElement productTitleTxt;
    @AndroidFindBy (id = "com.becon.ecom:id/email") 
    @iOSXCUITFindBy (iOSNsPredicate = "label == \"nagarjunam@becon.co\"")
    private MobileElement productTitleTxt ;
    
    @AndroidFindBy(id ="com.becon.ecom:id/ll_contact_us")
    @iOSXCUITFindBy (xpath = "/XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeCell[6]")
    private MobileElement contactus ;
    
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    @iOSXCUITFindBy(accessibility = "MY ACCOUNT")
    private MobileElement myaccountTitle ;
    
    @AndroidFindBy(id = "com.becon.ecom:id/description")
    @iOSXCUITFindBy(accessibility = "Message sent, The message has been sent to becon")
    
    private MobileElement msgsuccess;
    
	@AndroidFindBy (id = "com.becon.ecom:id/iv_edit")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTable/XCUIElementTypeButton[1]")

	private MobileElement profileEditBtn;
	
	@AndroidFindBy(id= "com.becon.ecom:id/description")
	@iOSXCUITFindBy(accessibility = "body_label_msg")
	
	private MobileElement pfSuccess;
	
	@AndroidFindBy(id = "com.becon.ecom:id/nav_home_screen_main")
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeTabBar[@name=\"Tab Bar\"]/XCUIElementTypeButton[1]")
	private MobileElement homeBtn;
	
	@AndroidFindBy(id = "com.becon.ecom:id/btn_logout")
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name=\"LOG OUT\"]")
	
	private MobileElement logoutBtn;


	public String getTitle()
	{

		return getText(productTitleTxt,"");
	}


	public ContactUs presscontact_us()
	{
		click(contactus);
		return new ContactUs();
		
	}

	
	public EditMyProfile pressProfileEdit()
	{
		click(profileEditBtn);
		return new EditMyProfile(); 
	}

	public HomePage BackToHome()
	{
		click(homeBtn);
		return new HomePage();
	}
	
	public MyAccountPage doLogut() {
		click(logoutBtn);
		return this;
	}
	
	
	
	
	

	
}
