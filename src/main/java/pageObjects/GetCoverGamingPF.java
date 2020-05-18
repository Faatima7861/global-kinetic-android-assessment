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

public class GetCoverGamingPF {

	public GetCoverGamingPF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Gaming']")
	public AndroidElement gaming;
	@FindBy(xpath = "//android.widget.TextView[@text='VR']")
	public AndroidElement vr;
	@FindBy(xpath = "//android.widget.TextView[@text='Gaming Console']")
	public AndroidElement gamingConsole;
	@FindBy(xpath = "//android.widget.TextView[@text='Gaming Equipment']")
	public AndroidElement gamingEquip;

}
