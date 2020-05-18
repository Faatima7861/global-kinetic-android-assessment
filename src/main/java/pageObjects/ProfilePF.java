package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePF {

	public ProfilePF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//profile button
	@FindBy(xpath = "//android.widget.TextView[@text='Profile']")
	public AndroidElement profile;

	//My Details 
	@FindBy(xpath = "//android.widget.TextView[@text='My Details']")
	public AndroidElement myDetails;
	@FindBy(xpath = "//android.widget.TextView[@text='First name']")
	public AndroidElement enterFirstName;
	@FindBy(xpath = "//android.widget.TextView[@text='Last name']")
	public AndroidElement enterLastName;
	//GovernmentID
	@FindBy(xpath = "//android.widget.TextView[@text='Government ID']")
	public AndroidElement governmentID;
	@FindBy(xpath = "//android.widget.TextView[@text='Government ID / Passport No']")
	public AndroidElement idNumberInsert;
	
	//Residential Address
	@FindBy(xpath = "//android.widget.TextView[@text='Residential Address']")
	public AndroidElement residentialAddress;
	
	//Email Address
	@FindBy(xpath = "//android.widget.TextView[@text='Email Address']")
	public AndroidElement emailAddress;
	@FindBy(xpath = "//android.widget.TextView[@text='Resend email confirmation']")
	public AndroidElement resendEmailConfirmation;
	//Mobile Number
	@FindBy(xpath = "//android.widget.TextView[@text='Mobile Number']")
	public AndroidElement mobileNumber;
	@FindBy(xpath = "//android.widget.EditText[@text='Phone number']")
	public AndroidElement phoneNumber;
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm change']")
	public AndroidElement confirmChange;
	@FindBy(xpath = "//android.widget.TextView[@text='Cancel pending update']")
	public AndroidElement cancelPendingUpdate;
	
	//OptionalDetails - Tax Number
	@FindBy(xpath = "//android.widget.TextView[@text='Optional Details']")
	public AndroidElement optionalDetails;
	@FindBy(xpath = "//android.widget.TextView[@text='Tax Number']")
	public AndroidElement taxNumber;
	
	//Notifications 
	@FindBy(xpath = "//android.widget.TextView[@text='Notifications']")
	public AndroidElement notifications;
	
	
	
	//Payments 
	@FindBy(xpath = "//android.widget.TextView[@text='Payments']")
	public AndroidElement payments;
	@FindBy(xpath = "//android.widget.TextView[@text='Add a payment type']")
	public AndroidElement addPaymentType;
	 //debit card 
	
	
	  //credit card
	
	
	
	
	//Settings & Permissions 
	@FindBy(xpath = "//android.widget.TextView[@text='Settings & Permissions']")
	public AndroidElement settingPermissions;
	@FindBy(xpath = "//android.widget.TextView[@text='Update passcode']")
	public AndroidElement updatePasscode;
	//current pin from login 
	//new pin 
	@FindBy(xpath = "//android.widget.TextView[@text='3']")
	public AndroidElement newpin1;
	@FindBy(xpath = "//android.widget.TextView[@text='0']")
	public AndroidElement newpin2;
	@FindBy(xpath = "//android.widget.TextView[@text='9']")
	public AndroidElement newpin3;
	@FindBy(xpath = "//android.widget.TextView[@text='0']")
	public AndroidElement newpin4;
	
	//Tax Certificates
	@FindBy(xpath = "//android.widget.TextView[@text='Tax Certificates']")
	public AndroidElement taxCertificates;
	@FindBy(xpath = "//android.widget.TextView[@text='Send to email']")
	public AndroidElement sendToEmail;
	@FindBy(xpath = "//android.widget.TextView[@text='2020']")
	public AndroidElement taxcert2020;
	@FindBy(xpath = "//android.widget.TextView[@text='2019']")
	public AndroidElement taxcert2019;
	@FindBy(xpath = "//android.widget.TextView[@text='2018']")
	public AndroidElement taxcert2018;
	@FindBy(xpath = "//android.widget.TextView[@text='Done']")
	public AndroidElement done;
	
	
	//Other 
	//View Group , Edit text
	////selfie index 0, save 3 dots index 2, governement Id country selection
	//back arrow
	@FindBy(xpath = "//android.view.ViewGroup") 
	public AndroidElement viewGroup;
	//save button
	@FindBy(xpath = "//android.widget.TextView[@text='Save']")
	public AndroidElement save;
	//edit text	
	@FindBy(className = "android.widget.EditText")
	public AndroidElement editText;
	
	
}
