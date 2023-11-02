package guru.qa.tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

@Tag("ios")
public class IOSTests extends TestBase {

    @Test
    @Description("Проверка отображения элементов")
    void uiElementsTest() {
        step("Проверка отображения элементов на главной", () -> {
            $(AppiumBy.className("XCUIElementTypeStaticText")).$(AppiumBy.name("UI Elements")).should(Condition.exist);
            $(AppiumBy.name("Text Button")).shouldBe(Condition.visible);
            $(AppiumBy.name("Text")).shouldBe(Condition.visible);
            $(AppiumBy.name("Tab Bar")).should(Condition.exist);
            $(AppiumBy.name("Web View")).should(Condition.exist);
            $(AppiumBy.name("Local Testing")).should(Condition.exist);
        });
    }
}
