package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.ConfigReader;
import utililities.Driver;

public class C05_QualitydemyLoginTesti {

    @Test
    public void test01(){
        //Qualitydemy  anasayfaya gıdın
          Driver.getDriver().get(ConfigReader.getProperty("qUrl"));
        //logın linkine tıklayın
         QualitydemyPage qualitydemyPage =new QualitydemyPage();
         qualitydemyPage.logınLınkı.click();

        // gecerlı username ve sıfre yi ilgili kutulara yazın
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
         qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));


        //login butonuna basın
        qualitydemyPage.logınButonu.submit();

        //basarılı olarak gırıs yapıldıgını test edın
       Assert.assertTrue(qualitydemyPage.basarılıGırısKontrolElementı.isDisplayed());

        //sayfayı kapatın
        Driver.closeDriver();
















    }

}
