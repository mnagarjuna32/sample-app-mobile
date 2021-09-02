package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends BaseTest {
	TestUtils utils = new TestUtils();

	@AndroidFindBy (id = "com.becon.ecom:id/email")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	private MobileElement usernameTxtFld;
	@AndroidFindBy (id = "com.becon.ecom:id/password")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Becon\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField")
	private MobileElement passwordTxtFld;
	@AndroidFindBy (id = "com.becon.ecom:id/btn_login")
	@iOSXCUITFindBy (iOSNsPredicate = "label == \"SIGN IN\" AND name == \"SIGN IN\" AND type == \"XCUIElementTypeButton\"")
	private MobileElement loginBtn;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	@iOSXCUITFindBy (accessibility = "body_label_msg")
	private MobileElement errTxt;


	public LoginPage enterUserName(String username) throws InterruptedException {
		clear(usernameTxtFld);
		sendKeys(usernameTxtFld, username, "login with " + username);
		return this;
	}

	public LoginPage enterPassword(String password) {
		clear(passwordTxtFld);
		sendKeys(passwordTxtFld, password, "password is " + password);
		return this;
	}

	public MyAccountPage pressLoginBtn() {
		click(loginBtn, "press login button");
		return new MyAccountPage();
	}

	public MyAccountPage login(String username, String password) throws InterruptedException {
		enterUserName(username);
		enterPassword(password);
		return pressLoginBtn();
	}

	public String getErrTxt() {
		String err = getText(errTxt, "error text is - ");
		return err;
	}

}
