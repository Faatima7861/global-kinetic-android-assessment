package elleven;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestData.DataGenerator;
import TestData.Idnumber;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HamburgerMenuPF;
import pageObjects.ReusablePF;
import pageObjects.GetCoverGamingPF;
import pageObjects.ProfilePF;

public class Profile extends ReusableMethods {

	@Test(priority = 0)
	public void profileClick() throws IOException, InterruptedException {

		ProfilePF profile = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		profile.profile.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * AndroidElement getCoverBtn = (AndroidElement)
		 * driver.findElements(By.className("android.widget.ImageView")) .get(3);
		 * getCoverBtn.click(); driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS);
		 */

		System.out.println("Profile Icon clicked");
	}

	// MyDetails
	@Test(priority = 1)
	public void myDetails() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		profile.myDetails.click();
		// AndroidElement myDetails = (AndroidElement)
		// driver.findElements(By.className("android.view.ViewGroup"));

		// System.out.println(myDetails);

		// yDetails.click();
		// profile.myDetails.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("My Details clicked");
	}

	@Test(priority = 2)
	public void dots() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		for (int i = 0; i < 2; i++) {
			AndroidElement dots = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup")).get(2);
			dots.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		System.out.println("Edit name/surname clicked");
	}

	/*
	 * @Test(priority = 2) // manual public void uploadSelfie() throws IOException,
	 * InterruptedException {
	 * 
	 * ProfilePF home = new ProfilePF(driver); ReusablePF reuse = new
	 * ReusablePF(driver); driver.manage().timeouts().implicitlyWait(20,
	 * TimeUnit.SECONDS); // need to start over or test fails for some weird reason
	 * reuse.startOverbtn.click(); reuse.clearAllInfo.click();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //
	 * home.home.click(); reuse.okbtn.click(); System.out.println("Clicked Home"); }
	 */

	@Test(priority = 3)
	public void name() throws IOException, InterruptedException {
		DataGenerator dataGen = new DataGenerator();
		ProfilePF profile = new ProfilePF(driver);
		profile.viewGroup.click();
		profile.editText.click();
		profile.enterFirstName.sendKeys(dataGen.nameGen(7));

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * AndroidElement purpleArrowName = (AndroidElement)
		 * driver.findElements(By.className("android.widget.ImageView")) .get(1);
		 * purpleArrowName.click(); driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS);
		 */
		System.out.println("Entered first name");
	}

	@Test(priority = 4)
	public void lastName() throws IOException, InterruptedException {
		DataGenerator dataGen = new DataGenerator();
		ProfilePF profile = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		profile.viewGroup.click();
		profile.editText.click();
		profile.enterLastName.sendKeys(dataGen.lastNameGen(7));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		 * AndroidElement purpleArrowSurname = (AndroidElement) driver
		 * .findElements(By.className("android.widget.ImageView")).get(2);
		 * purpleArrowSurname.click();
		 */
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Entered last name");

	}

	/*
	 * @Test(priority = 4) public void myDetails2() throws IOException,
	 * InterruptedException { ProfilePF home = new ProfilePF(driver); ReusablePF
	 * reuse = new ReusablePF(driver); reuse.editText.click();
	 * reuse.editText.sendKeys("R5500"); System.out.println("Entered amount");
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * AndroidElement purpleArrow2 = (AndroidElement)
	 * driver.findElements(By.className("android.widget.ImageView")) .get(1);
	 * purpleArrow2.click();
	 * System.out.println("Clicked arrow after entering amount");
	 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 * 
	 * }
	 */

	// Government ID
	@Test(priority = 5)
	public void governmentId() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		Idnumber idnumGen = new Idnumber();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		profile.governmentID.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		profile.editText.click();
		profile.editText.sendKeys(idnumGen.idNumGen(13));
		profile.save.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow.click();
		System.out.println("Clicked back arrow after entering email");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 6)
	public void residentialAddress() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);

		/*
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * profile.editText.click(); profile.editText.sendKeys("mh2dc");
		 * 
		 * AndroidElement purpleArrow = (AndroidElement)
		 * driver.findElements(By.className("android.widget.ImageView")) .get(2);
		 * purpleArrow.click(); driver.manage().timeouts().implicitlyWait(20,
		 * TimeUnit.SECONDS);
		 */

	}

	@Test(priority = 7)
	public void emailAddress() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		DataGenerator genData = new DataGenerator();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		profile.emailAddress.click();
		profile.editText.click();
		profile.editText.sendKeys(genData.emailGenerator(15));
		profile.save.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow.click();
		System.out.println("Clicked back arrow after entering email");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 8)
	public void mobileNumber() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		DataGenerator genData = new DataGenerator();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		profile.mobileNumber.click();
		profile.editText.click();
		profile.editText.sendKeys(genData.phoneNumberGenerator(7));

		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow.click();
		System.out.println("Clicked back arrow after editing mobile number");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("mobile number test - complete ");

	}

	@Test(priority = 9)
	public void taxNumber() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		DataGenerator genData = new DataGenerator();
		profile.taxNumber.click();
		profile.editText.click();
		profile.editText.sendKeys(genData.taxNumGen(7));
		profile.save.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("tax number test - complete ");

		// back to profile screen
	}

//Notifications
	@Test(priority = 10) // broken - do manually so long

	public void notifications() throws IOException, InterruptedException {
		// click back
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		ProfilePF profile = new ProfilePF(driver);
		profile.notifications.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrow2 = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow2.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Checked notifications and back");
	}

	// Payments
	@Test(priority = 11) // manual
	// click back
	public void payments() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		profile.payments.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//profile.addPaymentType.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 12) // manual - doesn't work
	public void addPaymentTypeDebit() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		reuse.okbtn.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Test(priority = 13)
	public void addPaymentTypeCredit() throws IOException, InterruptedException {
		// click back
		ProfilePF home = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// have you had insurance cover refused
		// home.nopeNotMe.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// insolvent
		// home.noWayAmigo.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	// Settings & Permissions
	@Test(priority = 14)
	public void settingsPermissions() throws IOException, InterruptedException {
		ProfilePF profile = new ProfilePF(driver);

		AndroidElement purpleArrow2 = (AndroidElement) driver.findElements(By.className("android.view.ViewGroup"))
				.get(0);
		purpleArrow2.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		profile.settingPermissions.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    profile.updatePasscode.click();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
profile.newpin1.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		profile.newpin2.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		profile.newpin3.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		profile.newpin.click();
	}

	// Tax Certificates
	@Test(priority = 15) // manual
	public void taxCertificates() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(3);
		System.out.println(purpleArrow);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Clicked understand policy tab");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for (int i = 0; i < 3; i++) {
			reuse.dueNow.click();
		}

	}

}
