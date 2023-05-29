package tests.day18_TestNgReports_ParalelCalıstırma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utililities.ConfigReader;
import utililities.Driver;
import utililities.TestBaseRapor;

public class C01_RaporluAmazonSearch extends TestBaseRapor {

    @Test
    public void test01(){
        extentTest=extentReports.createTest("Amazon arama testi ",
                                              "kullanıcı ıstedıgı kelımeyı aratabılmelı");
         //Amazona gıdın

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("kullanıcı amazon anasayfaya gıder");

        // Nutella ıcın arama yapın
        AmazonPages amazonPages =new AmazonPages();
        amazonPages.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);
      extentTest.info("arama kutusna belırlenen aranacak kelımeyı yazar ve aratır");

        //arama sonuclarının Nutella ıcerdıgını test edın

       String actualSonucYazısı=amazonPages.aramaSonucElementi.getText();
       String expecetedIcerik=ConfigReader.getProperty("amazonExpectedIcerik");
        Assert.assertTrue(actualSonucYazısı.contains(expecetedIcerik));
        extentTest.pass("belırlenen arancak kelıme aratıldıgında,arama sonucunda expectedIcerık oldugu test edıldı");

         Driver.closeDriver();









    }










}
