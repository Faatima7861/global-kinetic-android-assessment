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

public class LandingScreenPF {

	public LandingScreenPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	//Bottom menu
	@FindBy(xpath = "//android.widget.TextView[@text='HOME']")
	public AndroidElement home;
	@FindBy(xpath = "//android.widget.TextView[@text='Payments']")
	public AndroidElement payments;
	@FindBy(xpath = "//android.widget.TextView[@text='Wallet']")
	public AndroidElement wallet;
	@FindBy(xpath = "//android.widget.TextView[@text='Profile']")
	public AndroidElement profile;

	// hamburger menu
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
	@FindBy(xpath = "//android.widget.TextView[@text='Voting']")
	public AndroidElement voting;
	
	//Tabs 
	@FindBy(xpath = "//android.widget.TextView[@text='Mine']")
	public AndroidElement mine;
	@FindBy(xpath = "//android.widget.TextView[@text='Employees']")
	public AndroidElement employees;
	@FindBy(xpath = "//android.widget.TextView[@text='All']")
	public AndroidElement all;
	@FindBy(xpath = "//android.widget.TextView[@text='Past']")
	public AndroidElement past;
	@FindBy(xpath = "//android.widget.TextView[@text='Current']")
	public AndroidElement current;
	@FindBy(xpath = "//android.widget.TextView[@text='Upcoming']")
	public AndroidElement upcoming;
	@FindBy(xpath = "//android.widget.TextView[@text='Done']")
	public AndroidElement done;

    //other screen buttons
	@FindBy(className = "android.widget.ImageView")
	public AndroidElement backArrow;
	@FindBy(className = "android.widget.ImageView")
	public AndroidElement crossClose;
	
	//logInAutomatically 
	@FindBy(xpath ="//android.widget.TextView[@text='No thanks']")
	public AndroidElement noThanksBtn;
	@FindBy(xpath ="//android.widget.TextView[@text='Great, let's do it!']")
	public AndroidElement greatLetsDoItBtn;

}
