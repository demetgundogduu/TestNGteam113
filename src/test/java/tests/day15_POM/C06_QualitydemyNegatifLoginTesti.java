package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.ConfigReader;
import utililities.Driver;

public class C06_QualitydemyNegatifLoginTesti {



    @Test
    public void gecersızIsımSıfreTestii(){
        //Qualitydemy  anasayfaya gıdın
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));

        //logın linkine tıklayın
        QualitydemyPage qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();



        // gecersız username ve   sıfre yi ilgili kutulara yazın
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //login butonuna basın
        qualitydemyPage.logınButonu.submit();

        //basarılı olarak gırıs yapılamadıgını  test edın
        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());

        //sayfayı kapatın
        Driver.closeDriver();




    }



    @Test(groups = "smoke")
    public void gecersızIsımTestıı(){
        //Qualitydemy  anasayfaya gıdın
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));

        //logın linkine tıklayın
        QualitydemyPage qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();



        // gecersız username ve sıfre yi ilgili kutulara yazın
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //login butonuna basın
        qualitydemyPage.logınButonu.submit();

        //basarılı olarak gırıs yapılamadıgını  test edın
        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());

        //sayfayı kapatın
        Driver.closeDriver();



    }


    @Test
    public void gecersızSıfreTestii(){
        //Qualitydemy  anasayfaya gıdın
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));

        //logın linkine tıklayın
        QualitydemyPage qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();



        // gecerlı username ve  gecersız sıfre yi ilgili kutulara yazın
        qualitydemyPage.emaılKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));

        //login butonuna basın
        qualitydemyPage.logınButonu.submit();

        //basarılı olarak gırıs yapılamadıgını  test edın
        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());

        //sayfayı kapatın
        Driver.closeDriver();




    }











































}
