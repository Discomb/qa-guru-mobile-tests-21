package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    private static String accessKey = "mCJCRkiz1BGyzqUwWEsB";
    private static String userName = "penderfynydd_L7o96p";

    public static String getAccessKey() {
        return accessKey;
    }

    public static String getUserName() {
        return userName;
    }


    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();

        mutableCapabilities.setCapability("browserStack.user", userName);
        mutableCapabilities.setCapability("browserStack.key", accessKey);

        mutableCapabilities.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        mutableCapabilities.setCapability("device", "Google Pixel 3");
        mutableCapabilities.setCapability("os_version", "9.0");

        mutableCapabilities.setCapability("project", "QA Guru Mobile Project");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "sample-test");

        try {
            return new RemoteWebDriver(
                    new URL(String.format("https://%s:%s@hub.browserstack.com/wd/hub", userName, accessKey)), mutableCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
