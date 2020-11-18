package musicPlay;

import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;
//import com.sun.jna.platform.FileUtils;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class Base {
	public static AppiumDriverLocalService service;
	public static AndroidDriver<AndroidElement> driver;
	public static AppiumServiceBuilder builder;
	public DesiredCapabilities cap;
	public static Properties prop;

	@BeforeTest
	public void setUp() throws InterruptedException, IOException {
		service = startServer();
		System.out.println("Appium server started successfully");

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Set up successful");
		// service.stop();
	}

	public AppiumDriverLocalService startServer() throws InterruptedException {

		boolean flag = checkIfServerIsRunning(4723);
		if (!flag) {
			// service = AppiumDriverLocalService.buildDefaultService();
			// service.start();
			// System.out.println("Appium server started");

			// Build the Appium service
			/*
			 * builder = new AppiumServiceBuilder(); builder.withIPAddress("127.0.0.0");
			 * builder.usingPort(4723); builder.withCapabilities(cap);
			 * builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
			 * builder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
			 */

			// Start the server with the builder
			// service = AppiumDriverLocalService.buildService(builder);
			service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
					.usingDriverExecutable(new File("/usr/local/bin/node"))
					.withAppiumJS(new File("/usr/local/bin/appium")).withIPAddress("127.0.0.1").usingPort(4723));

			service.start();
			Thread.sleep(2000);
			System.out.println("Appium server started");

		}
		return service;
	}

	// have to check or else when tries to start again at new test method error
	// will be thrown
	public static boolean checkIfServerIsRunning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();

		} catch (IOException e) {
			// if control comes here, then the port is in use
			isServerRunning = true;

		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public static void startEmulator() throws IOException, InterruptedException {
		// DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability("isHeadless", true);
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "/src/main/java/resources/startEmulator.bat");
		Thread.sleep(6000);
		System.out.println("Started emulator");
	}

	public static AndroidDriver<AndroidElement> capabilities() throws IOException, InterruptedException {
		// FileInputStream fis = new FileInputStream(
		// System.getProperty("user.dir") +
		// "/src/main/java/resources/global.properties");
		// Properties prop = new Properties();
		// prop.load(fis);

		DesiredCapabilities capabilities = new DesiredCapabilities();

		/*
		 * File appDir = new File("src"); File app = new File(appDir, (String)
		 * prop.get(appName)); //DesiredCapabilities capabilities = new
		 * DesiredCapabilities(); String device=(String) prop.get("device"); device =
		 * System.getProperty("deviceName"); if (device.contains("emulator")) {
		 * startEmulator(); }
		 */
		// https://github.com/niche-tester/gk-assessment-qa-engineer/releases/download/1.0.0/UAMPMusicPlayerApp.apk

		startEmulator();
		prop = new Properties();

		FileInputStream appURL = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//resources//global.properties");

		prop.load(appURL);
		String appLocation = prop.getProperty("appLocation");
		System.out.println(appLocation);

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);
		capabilities.setCapability("app", appLocation);

		// capabilities.setCapability(MobileCapabilityType.APP,
		// System.getProperty("user.dir") + "/UAMPMusicPlayerApp.apk");
		capabilities.setCapability("noReset", true);
		// capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Desired capabilities successful ");
		return driver;

	}

	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException {
		// taskkill /F /IM node.exe -> windows
		Runtime.getRuntime().exec("killall node");
		Thread.sleep(3000);
	}

	public static void killEmulator() throws IOException, InterruptedException {
		// DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability("isHeadless", true);
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "/src/main/java/resources/killEmulator.bat");
		Thread.sleep(6000);
		System.out.println("Killed emulator");
	}

	@AfterTest
	public void afterTest() throws IOException, InterruptedException {
		// driver.resetApp(); // driver.quit();
		service.stop();
		System.out.println("After test - appium service stopped");
		killEmulator();

	}

}