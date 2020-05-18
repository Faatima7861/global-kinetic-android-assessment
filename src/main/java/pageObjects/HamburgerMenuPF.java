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

public class HamburgerMenuPF {

	public HamburgerMenuPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(className = "android.widget.ImageView")
	public AndroidElement menu;
	@FindBy(xpath = "//android.widget.TextView[@text='About']")
	public AndroidElement about;
	@FindBy(xpath = "//android.widget.TextView[@text='Invite friends']")
	public AndroidElement inviteFriends;
	@FindBy(xpath = "//android.widget.TextView[@text='Ask us anything']")
	public AndroidElement askUsAnything;
	@FindBy(xpath = "//android.widget.TextView[@text='Found a bug']")
	public AndroidElement foundAbug;
	@FindBy(xpath = "//android.widget.TextView[@text='Logout']")
	public AndroidElement logout;

	@FindBy(className = "android.widget.ImageView")
	public AndroidElement backArrow;

	@FindBy(className = "android.widget.ImageView")
	public AndroidElement crossClose;

}
