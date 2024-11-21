package definations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class LoginPageDefinitions  extends BasePage {
   // private static WebDriver driver;
    public final static int TIMEOUT = 5;
    LoginPage loginPage ;
    HomePage homePage;


    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {

        driver.get(url);

    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
        loginPage = new LoginPage(driver);
       loginPage.login(userName,passWord);
      /*  driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(passWord);
        driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/button")).submit();*/

    }

    @Then("User should be able to login successfully and new page open")
    public void verifyLogin() {
      homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getHeadingText(), "Dashboard");

    }

    @Then("User should be able to see error message {string}")
    public void verifyErrorMessage(String expectedErrorMessage) {
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage);

    }


}
