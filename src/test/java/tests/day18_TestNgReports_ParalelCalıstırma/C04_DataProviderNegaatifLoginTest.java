package tests.day18_TestNgReports_ParalelCalıstırma;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utililities.ConfigReader;
import utililities.Driver;

public class C04_DataProviderNegaatifLoginTest {
    @DataProvider
    public static Object[][] YanlısKullanıcıAdılistesi() {
        String[][] kullanıcıBilgileriArray={{"Memre","12345"},{"mustafa","23456"},
                {"Burcu","32459"},{"Cigdem","62625"},
                {"Ahmet","37456"},{"Kemal","68335"},
                {"Melike","34346"},{"Cınar","12425"},
                {"Muleyke","37456"},{"Kadir","68425"}};

        return kullanıcıBilgileriArray;
    }
    //verılen 10 kullanıcı bılgısı ıle sısteme gırıs yapılamadı
    //sısteme gırıs yapılamdıgını test edın

    @Test(dataProvider = "YanlısKullanıcıAdılistesi")
    public void gecersızIsımTestıı(String kullanıcıAdı, String password){
        //Qualitydemy  anasayfaya gıdın
        Driver.getDriver().get(ConfigReader.getProperty("qUrl"));

        //logın linkine tıklayın
        QualitydemyPage qualitydemyPage =new QualitydemyPage();
        qualitydemyPage.logınLınkı.click();



        // gecersız username ve sıfre yi ilgili kutulara yazın
        qualitydemyPage.emaılKutusu.sendKeys(kullanıcıAdı);
        qualitydemyPage.passwordKutusu.sendKeys(password);

        //login butonuna basın
        qualitydemyPage.logınButonu.submit();

        //basarılı olarak gırıs yapılamadıgını  test edın
        Assert.assertTrue(qualitydemyPage.emaılKutusu.isEnabled());

        //sayfayı kapatın
        Driver.closeDriver();



    }
}
