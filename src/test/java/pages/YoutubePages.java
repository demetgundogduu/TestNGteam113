package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililities.Driver;

public class YoutubePages {
    public YoutubePages(){
        PageFactory.initElements(Driver.getDriver(),this);




    }

    @FindBy(xpath = "//input[@role='combobox']")
    public WebElement youtubeAramaKutusu;


    @FindBy(xpath = "(//yt-icon[@id='logo-icon'])[1]")
    public WebElement youtubeResım;





}
