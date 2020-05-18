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

public class ReusablePF {

	public ReusablePF(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Get some cover!']")
	public AndroidElement getSomeCoverBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Start Over']")
	public AndroidElement startOverbtn;

	@FindBy(xpath = "//android.widget.TextView[@text='Just cover info']")
	public AndroidElement justCoverInfo;

	@FindBy(xpath = "//android.widget.TextView[@text='Clear all info']")
	public AndroidElement clearAllInfo;

	@FindBy(xpath = "//android.widget.TextView[@text='OK']")
	public AndroidElement okbtn;

	@FindBy(xpath = "//android.widget.TextView[@text='Let's go']")
	public AndroidElement letsGo;

	@FindBy(xpath = "//android.widget.TextView[@text='I'll do it later']")
	public AndroidElement doItLater;

	@FindBy(xpath = "//android.widget.TextView[@text='Yes']")
	public AndroidElement yes;

	@FindBy(xpath = "//android.widget.TextView[@text='No']")
	public AndroidElement no;

	@FindBy(className = "android.widget.ImageView")
	public AndroidElement imageView;

	@FindBy(className = "android.widget.EditText")
	public AndroidElement editText;

	@FindBy(xpath = "//android.widget.TextView[@text='Take Photo']")
	public AndroidElement takePhoto;

	@FindBy(xpath = "//android.widget.TextView[@text='Allow']")
	public AndroidElement allowCameraAccess;

	@FindBy(id = "com.android.camera:id/btn_done")
	public AndroidElement selectPhoto;

	@FindBy(xpath = "com.android.camera:id/btn_cancel")
	public AndroidElement declinePhoto;

	@FindBy(xpath = "//android.widget.TextView[@text='Right now']")
	public AndroidElement rightNow;

	@FindBy(xpath = "//android.widget.TextView[@text='Show me!']")
	public AndroidElement showMe;

	@FindBy(xpath = "//android.widget.TextView[contains(text(),'Due Now']")
	public AndroidElement dueNow;

	@FindBy(xpath = "//android.widget.TextView[@text='I'm done']")
	public AndroidElement done;

	
	
	
	
	
	
	// Payment Details page objects - Credit card
	@FindBy(xpath = "//android.widget.TextView[@text='Add a payment type']")
	public AndroidElement addPaymentType;
	@FindBy(xpath = "//android.widget.TextView[@text='Add a Credit Card']")
	public AndroidElement addCreditCard;
	@FindBy(xpath = "//android.widget.TextView[@text='Card number']")
	public AndroidElement cardNumber;
	@FindBy(xpath = "//android.widget.TextView[@text='Expiry']")
	public AndroidElement cardExpiry;
	@FindBy(xpath = "//android.widget.TextView[@text='CVV']")
	public AndroidElement cardCVV;
	@FindBy(xpath = "//android.widget.TextView[@text='Name on card']")
	public AndroidElement nameOnCard;
	@FindBy(xpath = "//android.widget.TextView[@text='Continue']")
	public AndroidElement continueBtn;
	// paymentMandate
	@FindBy(xpath = "//android.widget.TextView[@text='Accept']")
	public AndroidElement acceptPaymentMandate;

	// Payment Details page objects - Debit card
	@FindBy(xpath = "//android.widget.TextView[@text='Add a Debit Order']")
	public AndroidElement addDebitOrder;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Account Number']")
	public AndroidElement debitAccountNumber;
	
	

}
