package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.Driver;

public class C03_qualitydemyNegatifLoginTesti {
    @Test
    public void test01(){

        //quaitydemy ansayfaya gıdın
        Driver.getDriver().get("https://www.qualitydemy.com");

           //ılk logın lınkıne tıklayın
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();
        //kullanıcı adı olarak selenyum password olarak heyecandır yazın
        qualitydemyPage.emaılKutusu.sendKeys("selenıum");
        qualitydemyPage.passwordKutusu.sendKeys("heyecandır");
           //logın butonuna tıklayın
        qualitydemyPage.logınButonu.submit();
        // gırıs yapılamadıgını test edın//
        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());
        //sayfayı kapatın
        Driver.closeDriver();














    }
}
