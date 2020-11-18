package musicPlayTests;

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
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import musicPlay.Base;
import pageObjects.UserFlowPF;

public class Userflow extends Base {

	@Test(priority = 0)
	public void genres() {

		UserFlowPF uf = new UserFlowPF(driver);
		// AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		uf.genres.click();
		System.out.println("Success - Genre Clicked");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void rock() {

		UserFlowPF uf = new UserFlowPF(driver);
		uf.rock.click();
		System.out.println("Success - Selected Rock");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	public void motoCrossSong() throws IOException, InterruptedException {

		UserFlowPF uf = new UserFlowPF(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		uf.motoCross.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println("Success - Playing motocross");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test(priority = 3)
	public void pause() throws IOException, InterruptedException {
		UserFlowPF uf = new UserFlowPF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		uf.PlayPause.click();
		System.out.println("Success - Paused song");
	}

}
