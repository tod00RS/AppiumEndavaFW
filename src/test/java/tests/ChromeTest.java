package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.endava.appium.framework.util.BaseTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class ChromeTest extends BaseTest {

    AndroidDriver<WebElement> driver;

    @Test
    public void theOpen() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "tolinotab8");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
        driver.get("http://www.theopen.com/");

    }

    @AfterClass
    public void destroy() {
        driver.quit();
    }

}
