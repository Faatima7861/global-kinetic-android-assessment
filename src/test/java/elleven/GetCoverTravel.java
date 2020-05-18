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

import elleven.Base;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.GetCoverGadgetsPF;
import pageObjects.GetCoverJewelleryPF;
import pageObjects.GetCoverTravelPF;
import pageObjects.ReusablePF;

public class GetCoverTravel extends Base {

	@Test(priority = 0)
	public void travelGetCover() throws IOException, InterruptedException {

		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void travel() throws IOException, InterruptedException {

		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.startOverbtn.click();
		reuse.justCoverInfo.click();
		travel.travel.click();
		reuse.okbtn.click();
		System.out.println("Clicked category Travel");

	}

	@Test(priority = 2)
	public void travelSubCat() throws IOException, InterruptedException {

		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		travel.travel.click();
		reuse.okbtn.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Clicked travel subcategory");

	}

	@Test(priority = 3)
	public void localTravel() throws IOException, InterruptedException {

		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		travel.local.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Selected local");

	}

	@Test(priority = 4)
	public void flightNumber() throws IOException, InterruptedException {

		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		travel.flightNumNo.click();
		// when are you leaving default - then select yes
		reuse.okbtn.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.okbtn.click(); // click ok for getting back default
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("localComplete");

	}

	@Test(priority = 5)
	public void showMe() throws IOException, InterruptedException {
		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		reuse.showMe.click();

	}

	@Test(priority = 6)
	public void understandpolicy() throws IOException, InterruptedException {
		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(3);
		System.out.println(purpleArrow);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Clicked understand policy tab");

	}

	@Test(priority = 7)
	public void dueNow() throws IOException, InterruptedException {
		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for (int i = 0; i < 3; i++) {
			reuse.dueNow.click();
		}
	}

	@Test(priority = 8)
	public void selectPayment() throws IOException, InterruptedException {
		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AndroidElement radioBtn = (AndroidElement) driver.findElements(By.className("android.widget.ImageView")).get(3);
		System.out.println(radioBtn);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		radioBtn.click();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 9)
	public void dueNow2() throws IOException, InterruptedException {
		GetCoverTravelPF travel = new GetCoverTravelPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		for (int i = 0; i < 3; i++) {
			reuse.dueNow.click();
		}

	}

	@Test(priority = 10)
	public void acceptPaymentMandate() throws IOException, InterruptedException {
		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.acceptPaymentMandate.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.continueBtn.click();

	}

}
