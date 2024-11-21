package pages;

import definations.HookStepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//*[@class='oxd-topbar-header-breadcrumb']/h6")
    WebElement homePageHeading;
   WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //Verify new page - HomePage
    public String getHeadingText(){

        return homePageHeading.getText();
    }


}
