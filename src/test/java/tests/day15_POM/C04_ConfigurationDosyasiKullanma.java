package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utililities.ConfigReader;
import utililities.Driver;


  /*
   POM   de test classsında
   manuel olarak hıc bır test Data sı GIRMEMEKTIR

     Test dataları:
     1- Kullanacagımız WebDrıver: Driver classından dınamık kullanıyoruz
     2- locate lerı pages sayfalarından dınamık olarak kullanıyourz
     3-kullanılan Url,arananKelıme ,expected Icerik, dogru kullanıcı adı,
      yanlıs kullanıcı adı, yanlıs sıfre gıbı datalar
   */




public class C04_ConfigurationDosyasiKullanma {
    @Test
    public void test01(){


        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPages amazonPages =new AmazonPages();
        amazonPages.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);
        String expectedIcerik =ConfigReader.getProperty("amazonExpectedIcerik");
        String actualSonucYazısı=amazonPages.aramaSonucElementi.getText();
        Assert.assertTrue(actualSonucYazısı.contains(expectedIcerik));


        Driver.closeDriver();
















    }
}
