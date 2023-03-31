import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class SettingForTest {
    @BeforeAll
    public static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = System.getProperty("browser_size", "1600x1200"); //"1600x1200"; //1680x1050 1600x1200
        Configuration.browser = System.getProperty("browser", "chrome");//"chrome";
        Configuration.browserVersion = System.getProperty("browser_version", "100.0");//"100.0";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }
}
