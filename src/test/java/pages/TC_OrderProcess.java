package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_OrderProcess {
    public WebDriver driver;

    public By addToCartPath = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    public By addToCartIconPath = By.xpath("//div[@id='shopping_cart_container']");
    //public By addToCartIconPath = By.xpath("//div[@id='shopping_cart_container']");
    public By checkOutPath = By.xpath("//button[@id='checkout']");
    public By firstNamePath = By.name("firstName");
    public By lastNamePath = By.name("lastName");
    public By postalCodePath = By.xpath("//input[@id='postal-code']");
    public By continueBttnPath = By.xpath("//input[@id='continue']");
    public By finishBttnPath = By.xpath("//button[@id='finish']");

    public void addToCartMethod(){
        driver.findElement(addToCartPath).click();
    }
    public void addToCartIconMethod(){
        driver.findElement(addToCartIconPath).click();
    }
    public void checkOutMethod(){
        driver.findElement(checkOutPath).click();
    }
    public void firstNameMethod(String fname) throws InterruptedException {
        driver.findElement(firstNamePath).sendKeys(fname);
        Thread.sleep(2000);
    }

    public void lastNameMethod(String lname) throws InterruptedException {
        driver.findElement(lastNamePath).sendKeys(lname);
    }
    public void postalCodeMethod(String postal){
        driver.findElement(postalCodePath).sendKeys(postal);
    }
    public void continueBttnMethod(){
        driver.findElement(continueBttnPath).click();
    }
    public void finishBttnMethod(){
        driver.findElement(finishBttnPath).click();
    }
}
