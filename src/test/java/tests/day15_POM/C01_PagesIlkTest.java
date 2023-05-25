package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utililities.Driver;

public class C01_PagesIlkTest {

     @Test
    public void  amazonTest(){


          //Amazon anasayfasına gidelim
         Driver.getDriver().get("https://www.amazon.com");
          //Nutella ıcın arama yapalım
         //arama sonuclarının locate ı pages sayfasında
         //POM pages sayfasındakı locate erısmek ıcın
         //pages sayfalarından bır obje olusturulur
         AmazonPages amazonPages =new AmazonPages();
         amazonPages.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
          //sonucların Nutella ıcerdıgını test edelim
          String expecetedIcerik="Nutella";
          String actualAramaSonucYazısı=amazonPages.aramaSonucElementi.getText();
         Assert.assertTrue(actualAramaSonucYazısı.contains(expecetedIcerik));
        // sayfasyı kapatalım

          Driver.closeDriver();

















    }




















}
