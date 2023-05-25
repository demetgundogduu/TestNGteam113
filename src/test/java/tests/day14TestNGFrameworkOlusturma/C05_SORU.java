package tests.day14TestNGFrameworkOlusturma;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utililities.Driver;

public class C05_SORU {
    @Test
   public void test01(){

       // //1. Test : Amazon ana sayfaya gittiginizi test edin
       Driver.getDriver().get("https://www.amazon.com");
       //
       //    //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin arama yapin
       //    //ve aramanizin gerceklestigini Test edin
       AmazonPages amazonPages =new AmazonPages();
       amazonPages.aramaKutusu.sendKeys("Nutella" +Keys.ENTER);

         String expectedIcerik="Nutella";
     String actualSonucYazısı=amazonPages.aramaSonucElementi.getText();
       Assert.assertTrue(actualSonucYazısı.contains(expectedIcerik));

       //    //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin /

        amazonPages.ılkUrun.click();

















   }
}
