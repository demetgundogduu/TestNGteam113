package tests.day16_POM_Assertions;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.ConfigReader;
import utililities.Driver;

public class C05_NegatifTest {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Test
    public void qualityNegatif(){
        //NegativeTest
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));
        //2- login linkine basin

        qualitydemyPage.logınLınkı.click();
        //3- Kullanvalid 3 farkli test method’u olusturun.
        //- gecerli username, gecersiz password
        //- gecersiz username, gecerli password
        //- gecersiz username, gecersiz password.
        //4- Login butonuna basarak login olun
        //5- Basarili olarak giris yapilamadigini test edin//

    }
    //- gecerli username, gecersiz password
    @Test
    public void gecersızSıfre(){

         Driver.getDriver().get(ConfigReader.getProperty("qUrl"));

         qualitydemyPage.logınLınkı.click();
         qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
         qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
         qualitydemyPage.logınButonu.submit();

        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());
        Driver.closeDriver();


    }








    //- gecersiz username, gecerli password
    @Test
    public void gecersızIsım(){

        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));
        qualitydemyPage.logınLınkı.click();
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
         qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
         qualitydemyPage.logınButonu.submit();
         Assert.assertTrue(qualitydemyPage.passwordKutusu.isEnabled());

        Driver.closeDriver();



    }









    //- gecersiz username, gecersiz password.
    @Test
    public void gecersızısımSıfre(){

        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));
        qualitydemyPage.logınLınkı.click();
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
      qualitydemyPage.logınButonu.submit();
        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());

         Driver.closeDriver();






    }














}


