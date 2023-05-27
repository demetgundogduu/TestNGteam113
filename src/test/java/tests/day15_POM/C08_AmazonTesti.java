package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utililities.ConfigReader;
import utililities.Driver;
@Test
public class C08_AmazonTesti {
    @Test
    public void test01(){


      //1. Test : Amazon ana sayfaya gittiginizi test edin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
        //ve aramanizin gerceklestigini Test edin
        AmazonPages amazonPages =new AmazonPages();
        amazonPages.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83
        //oldugunu test edi//
         amazonPages.ılkUrun.click();
         String actualFiyat=amazonPages.ilkUrunFiyati.getText();
         String expectedFiyat=ConfigReader.getProperty("amazonFiyat");
        Assert.assertTrue(actualFiyat.contains(expectedFiyat));







    }
}
