package pages;

import base.BaseTest;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class LoginPage extends BaseTest {

    @AndroidFindBy(accessibility = "test-Usuario")
    public WebElement userName;

    @AndroidFindBy(accessibility = "test-Contraseña")
    public WebElement pass;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LOGIN\"]")
    public WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }


    public LoginPage enterName(String username) {
        enterText(userName, "standard_user");
        return this;
    }
}