package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
//        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserStack.user", "penderfynydd_L7o96p");
        mutableCapabilities.setCapability("browserStack.key", "mCJCRkiz1BGyzqUwWEsB");

        mutableCapabilities.setCapability("app", "");

        mutableCapabilities.setCapability("device", "Google Pixel 3");
        mutableCapabilities.setCapability("os_version", "9.0");

        mutableCapabilities.setCapability("project", "");
        mutableCapabilities.setCapability("build", "");
        mutableCapabilities.setCapability("name", "");

        RemoteWebDriver driver = new RemoteWebDriver(
                new URL("https://link"), mutableCapabilities);
        return null;
    }
}
