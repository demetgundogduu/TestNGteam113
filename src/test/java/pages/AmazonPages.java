package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utililities.Driver;

public class AmazonPages {
    //page classların sureklı kullandıgımız locate ıslemlerı varsa logın gıbı kucuk ıslevlerı
    // ıceren methodları methodlar barındırır
    //Selenıum ile locate locate ıslmemı veya herhangı bır ıslev gerceklestırmek ıstedıgımızde
    //WebDriver objesıne


    public AmazonPages(){
      PageFactory.initElements(Driver.getDriver(),this);
      //Bu ayarı constructor ıcıne koyma sebebımız
      //Page sayfalarına obje olusturularak ulasıldıgı ıcın
      //kim page sayfasını kullanmak ısterse
      //page sayfasından obje olusturmak ıcın ,constructor calısacak
      //ve constructor un ıcın de bulunan initElements() gerekli ayarı yapmıs olacak









  }

    @FindBy(id="twotabsearchtextbox")
    public  WebElement aramaKutusu;

     @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
        public WebElement aramaSonucElementi;

     @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement ılkUrun;

    @FindBy(id = "style_name_0_price")
    public WebElement ilkUrunFiyati;








}
