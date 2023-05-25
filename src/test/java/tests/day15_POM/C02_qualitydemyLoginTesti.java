package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.Driver;

public class C02_qualitydemyLoginTesti {
    @Test
    public void test01(){

        //Qualitydemy  anasayfaya gıdın
        Driver.getDriver().get("https://www.qualitydemy.com");
        //logın linkine tıklayın
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();
        // gecerlı username ve sıfre yi ilgili kutulara yazın
        qualitydemyPage.emaılKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        //login butonuna basın
        qualitydemyPage.logınButonu.submit();
        //basarılı olarak gırıs yapıldıgını test edın
        Assert.assertTrue(qualitydemyPage.basarılıGırısKontrolElementı.isDisplayed());

         //sayfayı kapatın
        Driver.closeDriver();

















    }
}
