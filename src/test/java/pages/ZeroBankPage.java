package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililities.Driver;

public class ZeroBankPage {
    public ZeroBankPage(){

        PageFactory.initElements(Driver.getDriver(),this);




    }

     @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinButonu;


     @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginKutusu;


     @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordKutusu;

     @FindBy(xpath = "//input[@name='submit']")
    public WebElement signinTusu;


     @FindBy(xpath = "//li[@id='onlineBankingMenu']")
    public WebElement onlineBakingMenusu;

     @FindBy(xpath = "(//span[@class='headers'])[4]")
    public WebElement PayBills;

     @FindBy(xpath = "//*[text()='Purchase Foreign Currency']")
    public WebElement purchaseForeıgnTusu;

     @FindBy(xpath = "//li[@id='pay_bills_tab']")
    public WebElement paybills2;
}
