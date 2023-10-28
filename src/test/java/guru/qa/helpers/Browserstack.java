package guru.qa.helpers;

import static guru.qa.drivers.BrowserstackDriver.getAccessKey;
import static guru.qa.drivers.BrowserstackDriver.getUserName;
import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {

//    curl -u "penderfynydd_L7o96p:mCJCRkiz1BGyzqUwWEsB" https://api.browserstack.com/automate/sessions/<session-id>.json

    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(getUserName(), getAccessKey())
                .when()
                .log().all()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
