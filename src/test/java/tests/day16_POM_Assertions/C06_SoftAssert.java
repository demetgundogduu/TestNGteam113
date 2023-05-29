package tests.day16_POM_Assertions;

import org.testng.annotations.Test;
import pages.ZeroBankPage;
import utililities.ConfigReader;
import utililities.Driver;

public class C06_SoftAssert {
    @Test
    public void test01(){

         ZeroBankPage zeroBankPage =new ZeroBankPage();
        //Yeni bir Class Olusturun : C03_SoftAssert
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        //2. Sign in butonuna basin
        zeroBankPage.signinButonu.click();
        //3. Login kutusuna “username” yazin
        zeroBankPage.loginKutusu.sendKeys(ConfigReader.getProperty("loginKutusu"));
        //4. Password kutusuna “password” yazin
        zeroBankPage.passwordKutusu.sendKeys("passwordKutusu");
        //5. Sign in tusuna basin
        zeroBankPage.signinTusu.click();
        //6. Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        zeroBankPage.onlineBakingMenusu.click();
        zeroBankPage.PayBills.click();
        //7. “Purchase Foreign Currency” tusuna basin
       // zeroBankPage.paybills2.click();
        //zeroBankPage.purchaseForeıgnTusu.click();
        //8. “Currency” drop down menusunden Eurozone’u secin
        //9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        //10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht//























    }

}