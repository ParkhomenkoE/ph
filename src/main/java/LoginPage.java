import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "defaultRegisterFormEmail")
    private WebElement emailInputField;
    @FindBy( css = "input[formcontrolname='password']")
    private WebElement passwordInputField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    public void login(String expectedEmail, String expectedPassword) {
        emailInputField.sendKeys(expectedEmail);
        passwordInputField.sendKeys(expectedPassword);
        loginButton.click();
    }
}


