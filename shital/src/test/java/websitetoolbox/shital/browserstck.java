package websitetoolbox.shital;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class browserstck 
{

  public static final String UserName = "shruti_Fr89e2";
  public static final String AutomateKey = "npgzHLERWZ7Yms1kDHzr";
  public static final String URL = "https://" + UserName + ":" + AutomateKey + "@hub-cloud.browserstack.com/wd/hub";


	
   @Test
  public void Setup() throws MalformedURLException
  
   {
	 
	 DesiredCapabilities caps=new DesiredCapabilities();
	 caps.setCapability("deviceName","iPhone 14 Pro Max");
	 caps.setCapability("os_version","16");
	 caps.setCapability("Project","BrowserStack Sample");
	 caps.setCapability("build","browserstack-build-1");
	 caps.setCapability("name","sample test");
	 //caps.setCapability("app","bs://6cbd454ddd06ca200f0a70539fb1aab12519f2d9");
	 caps.setCapability("app","bs://d9010df66078dd63bf9de81e437b2329df1e4691");
	 //AndroidDriver Driver = new AndroidDriver(new URL(URL),caps);
	 IOSDriver Driver = new IOSDriver(new URL(URL),caps);
	 Driver.quit();
	
	}
	
	
}
