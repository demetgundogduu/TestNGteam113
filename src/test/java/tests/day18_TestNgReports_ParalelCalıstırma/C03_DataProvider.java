package tests.day18_TestNgReports_ParalelCalıstırma;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPages;
import utililities.ConfigReader;
import utililities.Driver;

public class C03_DataProvider {
    /*
    dataprovider testNG nın test methodu dısında teste data saglamak ıcın olusturdugu ozel bır yapıdır
    bu yapı ıkı katlı bır array dondurur
     */
    @DataProvider
    public static Object[][] aranacaklarListesi() {
        String[][] aranacaklarArrayi={{"Java"},{"Apple"},{"Samsung"},{"Faker"},{"Cracker"}};
        return aranacaklarArrayi;
    }

    @Test(dataProvider = "aranacaklarListesi")
    public void test01(String aranacakKelime){
        //amazon ana sayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // bize test methodu dısından list olarak verılen urunlerın hepsi ıcın
        //arama kutusuna arama yapın

        AmazonPages amazonPage=new AmazonPages();
        amazonPage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);

        // ve sonuc yazısının arattıgınız elementı ıcerdıgını test edın
        String actualAramaSonucYazısı=amazonPage.aramaSonucElementi.getText();
        String expectedIcerik=aranacakKelime;
        Assert.assertTrue(actualAramaSonucYazısı.contains(expectedIcerik));

        Driver.closeDriver();














    }
}
