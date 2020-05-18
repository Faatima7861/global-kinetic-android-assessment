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

import io.appium.java_client.android.AndroidElement;
import pageObjects.GetCoverGadgetsPF;
import pageObjects.GetCoverGamingPF;
import pageObjects.ReusablePF;

public class GetCoverGadgets extends ReusableMethods {

	@Test(priority = 0)
	public void gadgets() throws IOException, InterruptedException {

		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.startOverbtn.click();
		reuse.yes.click();
		gadgets.gadgets.click();
		gadgets.okbtn.click();

	}

	@Test(priority = 1)
	public void smartphone() throws IOException, InterruptedException {

		GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver);
		ReusablePF reuse = new ReusablePF(driver);
		gadgets.smartphone.click();
		tellMeMore();
		System.out.println("EnteredTellMeMoreSmartPhone");
	}

	@Test(priority = 2) // manual step
	public void photoSmartphone() throws IOException, InterruptedException {
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
		reuse.editText.sendKeys("R5500");
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

/*
 * @Test(priority = 2) public void actionCamera() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * reuse.startOverbtn.click(); reuse.yes.click(); //reuse.justCoverInfo.click();
 * gadgets.gadgets.click(); gadgets.okbtn.click(); gadgets.actionCamera.click();
 * tellMeMore(); photo(); deviceValue(); rightNow();
 * System.out.println("Action Camera complete");
 * 
 * }
 * 
 * @Test(priority = 3) public void camera() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * gadgets.gadgets.click(); gadgets.okbtn.click(); reuse.startOverbtn.click();
 * reuse.justCoverInfo.click(); gadgets.camera.click(); tellMeMore(); photo();
 * deviceValue(); rightNow(); System.out.println("Camera complete"); }
 * 
 * @Test(priority = 3) public void smartphoneScreen() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * gadgets.gadgets.click(); gadgets.okbtn.click(); reuse.startOverbtn.click();
 * reuse.justCoverInfo.click(); gadgets.smartphoneScreenOnly.click();
 * tellMeMore(); photo(); deviceValue(); rightNow();
 * System.out.println("Smartphone screen complete"); }
 * 
 * @Test(priority = 3) public void tablet() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * gadgets.gadgets.click(); gadgets.okbtn.click(); reuse.startOverbtn.click();
 * reuse.justCoverInfo.click(); gadgets.tablet.click(); tellMeMore(); photo();
 * deviceValue(); rightNow(); System.out.println("Tablet complete"); }
 * 
 * @Test(priority = 3) public void eBook() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * gadgets.gadgets.click(); gadgets.okbtn.click(); reuse.startOverbtn.click();
 * reuse.justCoverInfo.click(); gadgets.ebookReader.click(); tellMeMore();
 * photo(); deviceValue(); rightNow(); System.out.println("eBook complete"); }
 * 
 * @Test(priority = 3) public void laptop() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * gadgets.gadgets.click(); gadgets.okbtn.click(); reuse.startOverbtn.click();
 * reuse.justCoverInfo.click(); gadgets.laptop.click(); tellMeMore(); photo();
 * deviceValue(); rightNow(); System.out.println("Laptop complete"); }
 * 
 * @Test(priority = 3) public void smartwatch() throws IOException,
 * InterruptedException { GetCoverGadgetsPF gadgets = new
 * GetCoverGadgetsPF(driver); ReusablePF reuse = new ReusablePF(driver);
 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 * gadgets.gadgets.click(); gadgets.okbtn.click(); reuse.startOverbtn.click();
 * reuse.justCoverInfo.click(); gadgets.smartwatch.click(); tellMeMore();
 * photo(); deviceValue(); rightNow();
 * System.out.println("Smartwatch complete"); }
 */

/*
 * @Test(priority = 1) public void attempt() throws IOException,
 * InterruptedException {
 * 
 * GetCoverGadgetsPF gadgets = new GetCoverGadgetsPF(driver); String[]
 * gadgetSubCategories = { "headphones", "actionCamera", "camera",
 * "smartphoneScreenOnly" };
 * 
 * List<AndroidElement> subCategories = driver.findElements(By.xpath("")); for
 * (int i = 0; i < subCategories.size(); i++) {
 * 
 * String name = subCategories.get(i).getText(); List x =
 * Arrays.asList(gadgetSubCategories); if (x.contains(name)) {
 * driver.findElements(By.xpath("")).get(i).click(); gadgets.headphones.click();
 * }
 * 
 * }
 * 
 * }
 */
