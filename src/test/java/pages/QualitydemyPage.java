package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililities.Driver;

public class QualitydemyPage {
    public QualitydemyPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

      @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement logınLınkı;

      @FindBy(xpath = "//input[@name='email']")
    public WebElement emaılKutusu;


      @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;


      @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement logınButonu;
         @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement basarılıGırısKontrolElementı;

}
