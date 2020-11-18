package elleven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import elleven.Base;
import io.appium.java_client.android.AndroidElement;
import pageObjects.ReusablePF;

public class ReusableMethods extends Base {

	public void tellMeMore() throws IOException, InterruptedException {

		ReusablePF reuse = new ReusablePF(driver);
		reuse.okbtn.click();
		reuse.editText.click();
		reuse.editText.sendKeys("AutoTellMeMore");

		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(2);
		purpleArrow.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	public void photo() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		for (int i = 0; i < 3; i++) {
			reuse.doItLater.click();
		}
		// photo - add multiple photos (4)
		/*
		 * reuse.letsGo.click(); reuse.takePhoto.click(); reuse.takePhoto.click();
		 * AndroidElement selectPhoto = (AndroidElement)
		 * driver.findElements(By.className("android.widget.ImageView")) .get(3);
		 * selectPhoto.click(); reuse.selectPhoto.click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * reuse.done.click();
		 * 
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 */
	}

	public void deviceValue() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		// device value
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.editText.click();
		reuse.editText.sendKeys("R6999");
		System.out.println("Entered amount");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AndroidElement purpleArrow2 = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(1);
		purpleArrow2.click();
		System.out.println("Clicked arrow after entering amount");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void rightNow() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		reuse.rightNow.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void showMe() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		reuse.showMe.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void understandPolicyTab() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// use image view locator and index accordingly
		AndroidElement purpleArrow = (AndroidElement) driver.findElements(By.className("android.widget.ImageView"))
				.get(3);
		purpleArrow.click();
		System.out.println("Clicked understand policy tab");

	}

	public void addPaymentType() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.addPaymentType.click();
		System.out.print("Add payment type clicked");
	}

	public void creditCard() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		reuse.cardNumber.click(); //
		reuse.cardNumber.sendKeys("4012888888881881");
		reuse.editText.sendKeys("4012888888881881");

		reuse.cardExpiry.click();
		reuse.editText.sendKeys("04/26");
		reuse.cardCVV.click();
		reuse.editText.sendKeys("567");

		reuse.nameOnCard.click();
		reuse.editText.sendKeys("AutoCardName");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		reuse.dueNow.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// acceptPaymentMandate home.acceptPaymentMandate.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	public void debitCard() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		reuse.addDebitOrder.click();
		reuse.debitAccountNumber.click();
		reuse.editText.click();
		reuse.editText.sendKeys("1200000000");
		reuse.imageView.click();
	}

	public void dueNow() throws IOException, InterruptedException {
		ReusablePF reuse = new ReusablePF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for (int i = 0; i < 3; i++) {
			reuse.dueNow.click();
		}

	}

}
