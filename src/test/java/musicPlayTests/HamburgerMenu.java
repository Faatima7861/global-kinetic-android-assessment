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

import elleven.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HamburgerMenuPF;

public class HamburgerMenu extends Base {

	@Test(priority = 1)
	public void about() throws IOException, InterruptedException {

		HamburgerMenuPF menu = new HamburgerMenuPF(driver);

		// AndroidDriver<AndroidElement> driver = capabilities();
		menu.menu.click();
		menu.about.click();
		menu.backArrow.click();

	}

	@Test(priority = 2)
	public void askUsAnything() throws IOException, InterruptedException {

		HamburgerMenuPF menu = new HamburgerMenuPF(driver);
		menu.askUsAnything.click();

	}

	@Test(priority = 3)
	public void foundABug() throws IOException, InterruptedException {

		HamburgerMenuPF menu = new HamburgerMenuPF(driver);
		menu.foundAbug.click();

	}

	@Test(priority = 4)
	public void logout() throws IOException, InterruptedException {

		HamburgerMenuPF menu = new HamburgerMenuPF(driver);
		menu.logout.click();
		menu.crossClose.click();

	}
}
