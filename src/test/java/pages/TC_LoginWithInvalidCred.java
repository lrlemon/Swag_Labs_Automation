package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_LoginWithInvalidCred {
    public WebDriver driver;
    public By userNamePath = By.xpath("//input[@id='user-name']");
    public By passwordPath = By.xpath("//input[@id='password']");
    public By loginPath = By.xpath("//input[@name='login-button']");
    public By errorMessagePath = By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]");

    public TC_LoginWithInvalidCred(WebDriver driver){
        this.driver = driver;
    }
    public void userNameMethod(String uname){
        driver.findElement(userNamePath).sendKeys(uname);
    }
    public void passwordMethod(String pass){
        driver.findElement(passwordPath).sendKeys(pass);
    }
    public void loginMethod(){
        driver.findElement(loginPath).click();
    }
    public String ErrorMessageMethod(){
        String textActual = driver.findElement(errorMessagePath).getText();
        return textActual;
    }
}
