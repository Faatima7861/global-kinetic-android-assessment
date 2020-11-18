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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HamburgerMenuPF;
import pageObjects.ReusablePF;
import pageObjects.GetCoverGamingPF;
import pageObjects.ProfilePF;

public class GetCoverHome extends ReusableMethods {

	@Test(priority = 0) // manual sometimes
	public void getCover() throws IOException, InterruptedException {

		ProfilePF home = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		AndroidElement getCoverBtn = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(3);
		getCoverBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("Clicked Get some cover!");
	}

	@Test(priority = 1)
	public void home() throws IOException, InterruptedException {

		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// need to start over or test fails for some weird reason
		reuse.startOverbtn.click();
		reuse.clearAllInfo.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	home.home.click();
		reuse.okbtn.click();
		System.out.println("Clicked Home");
	}

	@Test(priority = 2)
	public void homeAppliance() throws IOException, InterruptedException {

		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
	//	home.homeAppliance.click();
		reuse.okbtn.click();
		reuse.editText.click();
		reuse.editText.sendKeys("AutoHomeAppliance");

		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3) // manual
	public void photoHomeAppliance() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.doItLater.click(); // manual ALL THE TIME
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void value() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.editText.click();
		reuse.editText.sendKeys("R5500");
		System.out.println("Entered amount");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrow2 = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(1);
		purpleArrow2.click();
		System.out.println("Clicked arrow after entering amount");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@Test(priority = 5)
	public void email() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		DataGenerator genData = new DataGenerator();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		reuse.editText.click();
		reuse.editText.sendKeys(genData.emailGenerator(15));

		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		System.out.println("Clicked arrow after entering email");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 6)
	public void inviteCode() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.yes.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.editText.click();
		reuse.editText.sendKeys("mh2dc");

		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 7)
	public void name() throws IOException, InterruptedException {

		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.editText.click();
		reuse.editText.sendKeys("AutoTestName");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrowName = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(1);
		purpleArrowName.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 8)
	public void surname() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.editText.click();
		reuse.editText.sendKeys("AutoTestLastName");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrowSurname = (AndroidElement) driver
				.findElements(By.className("android.widget.ImageView")).get(2);
		purpleArrowSurname.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Entered first and last name");

	}

	@Test(priority = 9)
	public void idNumber() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		DataGenerator genData = new DataGenerator();
		reuse.okbtn.click();
		reuse.editText.click();
		// reuse.editText.sendKeys(genData.idNumber);
		reuse.editText.sendKeys("9206032534186");
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Entered idNumber");

	}

	@Test(priority = 10) // broken - do manually so long
	public void selfie() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.takePhoto.click();
		reuse.allowCameraAccess.click();
		reuse.allowCameraAccess.click();
		reuse.takePhoto.click();
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(3);
		purpleArrow.click();
		reuse.selectPhoto.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//scroll down screen

	}

	@Test(priority = 11) // manual
	public void creditCheck() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//home.goAhead.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 12) // manual - doesn't work
	public void insuranceClaims() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		reuse.okbtn.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Test(priority = 13)
	public void cancelledRefused() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		// have you had insurance cover refused
		//home.nopeNotMe.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// insolvent
		//home.noWayAmigo.click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	@Test(priority = 14)
	public void rightNowShowMe() throws IOException, InterruptedException {

		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		rightNow();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		showMe();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@Test(priority = 15) // manual
	public void dueNow() throws IOException, InterruptedException {
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

	@Test(priority = 16)
	public void payment() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		reuse.addPaymentType.click(); // manual
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@Test(priority = 17)
	public void debitOrder() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.addDebitOrder.click();
		reuse.debitAccountNumber.click();
		reuse.editText.click();
		reuse.editText.sendKeys("1200000000");
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(4);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.dueNow.click();

	}

	@Test(priority = 18)
	public void acceptPaymentMandate() throws IOException, InterruptedException {
		ProfilePF home = new ProfilePF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.acceptPaymentMandate.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.continueBtn.click();

	}

}
