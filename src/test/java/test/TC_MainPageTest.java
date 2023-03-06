package test;

import base.BasePage;
import base.CredentialsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TC_MainPage;

public class TC_MainPageTest extends BasePage {
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

    @Test(priority = 3, description = "Order Process")
    public void orderProcess() throws InterruptedException {
        TC_MainPage login2 = new TC_MainPage(driver);
        driver.get(loginurl);
        Thread.sleep(1000);
        CredentialsPage cred = new CredentialsPage();
        String username = cred.usernameCred();
        String password = cred.passcred();
        login2.userNameMethod(username);
        login2.passwordMethod(password);

        login2.loginMethod();
        Thread.sleep(3000);
        login2.addToCartMethod();
        login2.addToCartIconMethod();
        Thread.sleep(3000);
        login2.checkOutMethod();
        Thread.sleep(2000);
        login2.firstNameMethod("Latifur");
        login2.lastNameMethod("Lemon");
        login2.postalCodeMethod("12345");
        login2.continueBttnMethod();
        Thread.sleep(2000);
        login2.finishBttnMethod();
    }

}
