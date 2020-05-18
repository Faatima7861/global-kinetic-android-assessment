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

public class GetCoverTravelPF {

	public GetCoverTravelPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Travel']")
	public AndroidElement travel;
	@FindBy(xpath = "//android.widget.TextView[@text='Local']")
	public AndroidElement local;
	@FindBy(xpath = "//android.widget.TextView[@text='International']")
	public AndroidElement international;
	@FindBy(xpath = "//android.widget.TextView[@text='I do']")
	public AndroidElement flightNumYes;
	@FindBy(xpath = "//android.widget.TextView[@text='Not with me']")
	public AndroidElement flightNumNo;

}
