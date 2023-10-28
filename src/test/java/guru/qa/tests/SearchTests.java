package guru.qa.tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.*;

public class SearchTests extends TestBase {

    @Test
    void successfulSearchTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        $$(className("android.widget.TextView")).shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
