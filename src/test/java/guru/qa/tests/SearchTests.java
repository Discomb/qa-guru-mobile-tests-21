package guru.qa.tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchTests extends TestBase {

    @Test
    void successfulSearchTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(CollectionCondition.sizeGreaterThan(0));
    }

    @Test
    void openArticle() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("France");
        $$(id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(CollectionCondition.sizeGreaterThan(0));
        $$(id("org.wikipedia.alpha:id/page_list_item_title")).first().click();
        $(id("org.wikipedia.alpha:id/view_wiki_error_icon")).should(exist);
        $(id("org.wikipedia.alpha:id/view_wiki_error_text")).shouldHave(text("An error occurred"));
        $(id("org.wikipedia.alpha:id/view_wiki_error_button")).should(exist);
        $(id("org.wikipedia.alpha:id/view_wiki_error_button")).shouldHave(text("GO BACK"));
    }
}
