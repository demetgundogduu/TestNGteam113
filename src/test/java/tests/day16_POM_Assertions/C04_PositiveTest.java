package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.ConfigReader;
import utililities.Driver;

public class C04_PositiveTest {

    @Test
    public void qualityTest(){



        //PositiveTest
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));
        //2- login linkine basin
        QualitydemyPage qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();
        //3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        //4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        //5- Login butonuna basarak login olun
        qualitydemyPage.logınButonu.submit();
        //6- Basarili olarak giris yapilabildigini test edi//
        Assert.assertTrue(qualitydemyPage.basarılıGırısKontrolElementı.isDisplayed());












    }
}
