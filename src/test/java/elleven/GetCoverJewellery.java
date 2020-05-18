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

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.GetCoverGadgetsPF;
import pageObjects.GetCoverJewelleryPF;
import pageObjects.ReusablePF;

public class GetCoverJewellery extends ReusableMethods {

	@Test(priority = 0)
	public void jewellery() throws IOException, InterruptedException {

		GetCoverJewelleryPF jewellery = new GetCoverJewelleryPF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.startOverbtn.click();
		reuse.yes.click();
		jewellery.jewellery.click();
		reuse.okbtn.click();
	}

	@Test(priority = 1)
	public void jewellerySubcat() throws IOException, InterruptedException {

		GetCoverJewelleryPF jewellery = new GetCoverJewelleryPF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		jewellery.jewellery.click();
		reuse.okbtn.click();
		tellMeMore();
		reuse.no.click(); // are you at the jeweller now?
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 2) // manual step
	public void photoJewellery() throws IOException, InterruptedException {
		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.doItLater.click(); // manual ALL THE TIME
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 3)
	public void value() throws IOException, InterruptedException {
		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		reuse.editText.click();
		reuse.editText.sendKeys("R20000");
		System.out.println("Entered amount");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrow2 = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(1);
		purpleArrow2.click();
		System.out.println("Clicked arrow after entering amount");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	}

	@Test(priority = 4)
	public void rightNowShowMe() throws IOException, InterruptedException {

		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		rightNow();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		showMe();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

	}

	@Test(priority = 5) // manual
	public void dueNow() throws IOException, InterruptedException {
		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
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

	@Test(priority = 6)
	public void payment() throws IOException, InterruptedException {
		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(3);
		System.out.println(purpleArrow);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		purpleArrow.click();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@Test(priority = 7)
	public void acceptPaymentMandate() throws IOException, InterruptedException {
		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.acceptPaymentMandate.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		reuse.continueBtn.click();

	}

}
