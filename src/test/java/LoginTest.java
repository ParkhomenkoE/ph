import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;


public class LoginTest extends BaseTest {

    @Test
    public void successLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(app.driver);
        loginPage.login("test@gmail.com", "test@gmail.com");

        HeaderPage headerPage = new HeaderPage(app.driver);
        //sleep(5000);
        Assert.assertTrue(headerPage.isHeaderPresent());


    }

}
