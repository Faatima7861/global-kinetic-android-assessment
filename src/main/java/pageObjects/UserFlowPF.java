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

public class UserFlowPF {

	public UserFlowPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	// landing page
	@FindBy(xpath = "//android.widget.TextView[@text='Genres']")
	public AndroidElement genres;
	@FindBy(xpath = "//android.widget.TextView[@text='Rock']")
	public AndroidElement rock;
	@FindBy(xpath = "//android.widget.TextView[@text='Motocross']")
	public AndroidElement motoCross;
	@FindBy(id = "com.instantappsample.uamp:id/play_pause")
	public AndroidElement PlayPause;

}
