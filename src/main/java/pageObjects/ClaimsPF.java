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

public class ClaimsPF {

	public ClaimsPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Make a claim']")
	public AndroidElement makeClaim;

	@FindBy(xpath = "//android.widget.TextView[@text='Stolen / lost']")
	public AndroidElement stolen;

	@FindBy(xpath = "//android.widget.TextView[@text='AutoHomeAppliance']")
	public AndroidElement autoHomeAppliance;

	@FindBy(xpath = "//android.widget.TextView[@text='Video']")
	public AndroidElement claimVideo;
	@FindBy(xpath = "//android.widget.TextView[@text='Take Video...]")
	public AndroidElement takeVideo;
	@FindBy(id = "com.android.camera:id/shutter_button")
	public AndroidElement shutterBtn;
	@FindBy(id = "	com.android.camera:id/btn_done")
	public AndroidElement tickBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Submit']")
	public AndroidElement submit;
	

}
