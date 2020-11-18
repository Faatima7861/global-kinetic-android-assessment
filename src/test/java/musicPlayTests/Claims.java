package elleven;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
import java.util.Arrays;
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
import io.appium.java_client.android.AndroidElement;
import pageObjects.ClaimsPF;
import pageObjects.GetCoverGadgetsPF;
import pageObjects.GetCoverGamingPF;
import pageObjects.ProfilePF;
import pageObjects.ReusablePF;

public class Claims extends ReusableMethods {

	@Test(priority = 0)
	public void claim() throws IOException, InterruptedException {

		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(10);
		System.out.println(purpleArrow);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		purpleArrow.click();
	}

	@Test(priority = 1)
	public void makeClaim() throws IOException, InterruptedException {

		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		claim.makeClaim.click();
		reuse.startOverbtn.click();
		reuse.yes.click();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

	}

	@Test(priority = 2)

	public void homeClaim() throws IOException, InterruptedException {
		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		ProfilePF home = new ProfilePF(driver);
	//	home.homeAppliance.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.okbtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 3)
	public void stolen() throws IOException, InterruptedException {
		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		claim.stolen.click();
	}

	@Test(priority = 4)
	public void incidentDate() throws IOException, InterruptedException {

		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		reuse.okbtn.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test(priority = 5)
	public void replacementDevice() throws IOException, InterruptedException {
		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		claim.autoHomeAppliance.click();
		reuse.okbtn.click();

	}

	@Test(priority = 6)
	public void alternateContact() throws IOException, InterruptedException {
		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		DataGenerator genData = new DataGenerator();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.editText.click();
		reuse.editText.sendKeys(genData.phoneNumberGenerator(10));
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		System.out.println(purpleArrow);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		purpleArrow.click();
	}

	@Test(priority = 7)
	public void claimVideo() throws IOException, InterruptedException {
		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		claim.claimVideo.click();
		claim.takeVideo.click();
		reuse.allowCameraAccess.click();
		reuse.allowCameraAccess.click();
		claim.shutterBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		claim.shutterBtn.click();
		claim.tickBtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 8)
	public void submit() throws IOException, InterruptedException {
		ClaimsPF claim = new ClaimsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		claim.submit.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
