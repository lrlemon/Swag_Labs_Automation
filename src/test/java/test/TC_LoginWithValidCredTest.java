package test;

import base.BasePage;
import base.CredentialsPage;
import org.testng.annotations.Test;
import pages.TC_MainPage;

public class TC_LoginWithValidCredTest extends BasePage {
    @Test(priority = 1, description = "Login with valid credentials")
    public void loginTestWithValid() throws InterruptedException {

        TC_MainPage login = new TC_MainPage(driver);
        driver.get(loginurl);
        Thread.sleep(1000);

        CredentialsPage cred = new CredentialsPage();
        String username = cred.usernameCred();
        String password = cred.passcred();

        login.userNameMethod(username);
        login.passwordMethod(password );
        login.loginMethod();
        Thread.sleep(3000);
    }
}
