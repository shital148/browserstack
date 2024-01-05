package websitetoolbox.shital;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class appiumbasics {
	
	@Test
	public void appiumTest() throws MalformedURLException
	{
	//AndroidDriver
		//appium code
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("vivo I2017");
		options.setApp("C:\\Users\\Admin\\eclipse-workspace\\shital\\src\\test\\java\\resourses\\ApiDemos-debug.apk");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
		//actual automation code
		driver.quit();
		service.stop();
		
	}

	

}
