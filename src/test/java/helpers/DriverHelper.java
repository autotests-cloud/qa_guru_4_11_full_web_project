package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static org.openqa.selenium.logging.LogType.BROWSER;

public class DriverHelper {
    public static void configureDriver() {
        Configuration.baseUrl = "https://pure.app";
        Configuration.timeout = 10000;
    }

    public static String getConsoleLogs() {
        return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
    }
}
