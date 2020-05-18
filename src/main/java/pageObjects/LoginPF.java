package pageObjects;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPF {

	public LoginPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// landing page
	@FindBy(xpath = "//android.widget.TextView[@text='SIGN IN / SIGN UP']")
	public AndroidElement signIn;
	@FindBy(xpath = "//android.widget.TextView[@text='SIGN IN']")
	public AndroidElement signIn2;
	@FindBy(xpath = "//android.widget.EditText[@text='Phone number']")
	public AndroidElement phoneNumber;
	@FindBy(className = "android.widget.EditText")
	public AndroidElement editText;

	@FindBy(xpath = "//android.widget.TextView[@text='Next']")
	public AndroidElement next;
	@FindBy(xpath = "//android.widget.TextView[@text='2']")
	public AndroidElement pincode1;
	@FindBy(xpath = "//android.widget.TextView[@text='0']")
	public AndroidElement pincode2;
	@FindBy(xpath = "//android.widget.TextView[@text='0']")
	public AndroidElement pincode3;
	@FindBy(xpath = "//android.widget.TextView[@text='0']")
	public AndroidElement pincode4;

	// otp - locators in test class : Find a way to use them in here
	


}
