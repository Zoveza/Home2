import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;

public class DriverFactory {

    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Android");
        capabilities.setCapability(APP_PACKAGE,"ANDROID");
        capabilities.setCapability(APP_ACTIVITY, "com.android.settings.Settings");
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        return new AndroidDriver(remoteUrl, capabilities);
    }
}
