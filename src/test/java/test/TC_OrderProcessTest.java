package test;

import base.BasePage;
import base.CredentialsPage;
import org.testng.annotations.Test;
import pages.TC_MainPage;

public class TC_OrderProcessTest extends BasePage {
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
