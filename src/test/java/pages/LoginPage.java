package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(name = "username")
    WebElement userNameTextBox;
    @FindBy(name = "password")
    WebElement passwordTextBox;

    @FindBy(xpath = " //*[@class='oxd-form']/div[3]/button")
    WebElement loginButton;

    @FindBy(xpath = " //*[@class='orangehrm-login-error']/div[1]/div[1]/p")
    WebElement errorMessage;



    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // login to application
    public void login(String userName,String passWord){
        userNameTextBox.sendKeys(userName);
        userNameTextBox.sendKeys(passWord);
        loginButton.submit();
    }
    // Verify Error Message
    public String getErrorMessage(){

        return errorMessage.getText();
    }
}
