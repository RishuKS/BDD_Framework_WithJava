package definations;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.BasePage;

public class HookStepDefinitions extends BasePage {

    @Before
    public void openBrowser() {

        init();

    }

    @After
    public void teardown() {

        closeBrowser();
    }
}
