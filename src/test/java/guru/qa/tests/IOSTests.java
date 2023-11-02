package guru.qa.tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

@Tag("ios")
public class IOSTests extends TestBase{

    @Test
    void somethingTest() {
        $(AppiumBy.className("XCUIElementTypeStaticText")).$(AppiumBy.name("UI Elements")).should(Condition.exist);
        $(AppiumBy.name("Text Button")).shouldBe(Condition.visible);
        $(AppiumBy.name("Text")).shouldBe(Condition.visible);
        $(AppiumBy.name("Tab Bar")).should(Condition.exist);
        $(AppiumBy.name("Web View")).should(Condition.exist);
        $(AppiumBy.name("Local Testing")).should(Condition.exist);
    }
}
