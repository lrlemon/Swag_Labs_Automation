package test;

import base.BasePage;
import base.CredentialsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TC_MainPage;

public class TC_LoginWithInvalidCredTest extends BasePage {
    @Test(priority = 2, description = "Login with INvalid credentials")
    public void loginTestWithInvalid() throws InterruptedException{
        TC_MainPage login1 = new TC_MainPage(driver);
        driver.get(loginurl);
        Thread.sleep(1000);
        CredentialsPage cred = new CredentialsPage();
        String username = cred.wrongUsernameCred();
        String password = cred.wrongPasscred();
        login1.userNameMethod(username);
        login1.passwordMethod(password);
        login1.loginMethod();
        Thread.sleep(1500);
        String txtExpected="Epic sadface: Username and password do not match a";
        Assert.assertTrue(login1.ErrorMessageMethod().contains(txtExpected));
        Assert.assertEquals("Swag" , "Labs");
    }
}
