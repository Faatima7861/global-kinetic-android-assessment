package elleven;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.DataGenerator;
import elleven.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pageObjects.LandingScreenPF;
import pageObjects.LoginPF;

public class Login extends Base {

	@Test(priority = 0)
	public void signup() {

		LoginPF login = new LoginPF(driver);
		// AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.signIn.click();
		System.out.println("Success - SignIn Clicked");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void phoneNumber() {

		LoginPF login = new LoginPF(driver);
		DataGenerator genData = new DataGenerator();
		login.phoneNumber.click();
		login.editText.sendKeys(genData.phoneNumberGenerator(7));
		login.signIn2.click();
		System.out.println("Success - Entered phone number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}
	
	@Test(priority = 2)
	public void pincode() throws IOException, InterruptedException {

		LoginPF login = new LoginPF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login.pincode1.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		login.pincode2.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		login.pincode3.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		login.pincode4.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Success - Entered pincode");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority = 3)
	public void closePopUp() throws IOException, InterruptedException {
		LandingScreenPF ls = new LandingScreenPF(driver);
		ls.crossClose.click();
		
	}
	
	@Test(priority = 4)
	public void automaticSignIn() throws IOException, InterruptedException {
		LandingScreenPF ls = new LandingScreenPF(driver);
		ls.noThanksBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	/*@Test(priority = 4)
	public void verifyLandingpage() throws IOException, InterruptedException {
		LandingScreenPF ls = new LandingScreenPF(driver);
	}*/



	/*
	 * @Test(priority = 1) public void pincode() throws IOException,
	 * InterruptedException { //service = startServer(); LoginPF login = new
	 * LoginPF(driver); driver.manage().timeouts().implicitlyWait(20,
	 * TimeUnit.SECONDS); login.pincode1.click();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * login.pincode2.click(); driver.manage().timeouts().implicitlyWait(20,
	 * TimeUnit.SECONDS); login.pincode3.click();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * login.pincode4.click(); driver.manage().timeouts().implicitlyWait(40,
	 * TimeUnit.SECONDS); System.out.println("Success - Entered pincode");
	 * //service.stop(); }
	 * 
	 * @Test(priority = 2) public void otp() throws IOException,
	 * InterruptedException { //service = startServer(); LoginPF login = new
	 * LoginPF(driver);
	 * 
	 * AndroidElement otp1 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.EditText")).get(0);
	 * otp1.click(); otp1.sendKeys("1"); AndroidElement otp2 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.EditText")).get(1);
	 * otp2.click(); otp2.sendKeys("2"); AndroidElement otp3 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.EditText")).get(2);
	 * otp3.click(); otp3.sendKeys("3"); AndroidElement otp4 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.EditText")).get(3);
	 * otp4.click(); otp4.sendKeys("4"); AndroidElement otp5 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.EditText")).get(4);
	 * otp5.click(); otp5.sendKeys("5"); AndroidElement otp6 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.EditText")).get(5);
	 * otp6.click(); otp6.sendKeys("6");
	 * 
	 * System.out.println("Success - Entered OTP"); //service.stop(); }
	 * 
	 * @Test(priority = 3) public void noFingerPrintActivation() throws IOException,
	 * InterruptedException { //service = startServer(); LoginPF login = new
	 * LoginPF(driver); driver.manage().timeouts().implicitlyWait(10,
	 * TimeUnit.SECONDS); login.noThanksBtn.click();
	 * driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 * System.out.println("Closed activate fingerprint pop up"); //service.stop();
	 * 
	 * }
	 * 
	 * @Test(priority = 4) public void four() throws IOException,
	 * InterruptedException { //service = startServer();
	 * System.out.print("Test 4 test"); service.stop(); }
	 */

}
