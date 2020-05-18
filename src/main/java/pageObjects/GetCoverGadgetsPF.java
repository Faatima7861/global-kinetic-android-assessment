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

public class GetCoverGadgetsPF {

	public GetCoverGadgetsPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Gadgets']")
	public AndroidElement gadgets;
	@FindBy(xpath = "//android.widget.TextView[@text='OK']")
	public AndroidElement okbtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Headphones']")
	public AndroidElement headphones;
	@FindBy(xpath = "//android.widget.TextView[@text='Action Camera']")
	public AndroidElement actionCamera;
	@FindBy(xpath = "//android.widget.TextView[@text='Camera']")
	public AndroidElement camera;
	@FindBy(xpath = "//android.widget.TextView[@text='Smartphone - screen only']")
	public AndroidElement smartphoneScreenOnly;
	@FindBy(xpath = "//android.widget.TextView[@text='Tablet']")
	public AndroidElement tablet;
	@FindBy(xpath = "//android.widget.TextView[//*[contains(text(), 'do it later')]")
	public AndroidElement doItLater;
	@FindBy(xpath = "//android.widget.TextView[@text='eBook Reader']")
	public AndroidElement ebookReader;
	@FindBy(xpath = "//android.widget.TextView[@text='Laptop']")
	public AndroidElement laptop;
	@FindBy(xpath = "//android.widget.TextView[@text='Smartwatch']")
	public AndroidElement smartwatch;
	@FindBy(xpath = "//android.widget.TextView[@text='Smartphone']")
	public AndroidElement smartphone;



}
