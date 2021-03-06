package tests;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("web")
@Feature("Login tests")
public class LoginTests extends TestBase {
    @Test
    @DisplayName("Successful login Google account")
    void loginWithGoogle() {
        open("");

        $(".android.login-button").click();
        googleAuthPage.login("purevtest1", "purevtest1#_aA");

        $(by("data-test-id", "onboarding-geolocation-access")).shouldBe(visible);
    }
}