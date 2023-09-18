import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage{

public HeaderPage(WebDriver driver){
    super(driver);
}

@FindBy(css= "[ng-reflect-router-link=\".\"]")
    private WebElement header;

public boolean isHeaderPresent(){
    return header.isDisplayed();
}

}
