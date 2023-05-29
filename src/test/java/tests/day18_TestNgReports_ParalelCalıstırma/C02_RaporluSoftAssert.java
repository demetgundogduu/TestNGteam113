package tests.day18_TestNgReports_ParalelCalıstırma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utililities.Driver;
import utililities.TestBaseRapor;

public class C02_RaporluSoftAssert extends TestBaseRapor {

     @Test
    public void test01(){
         extentTest=extentReports.createTest("Alert test","Kullanıcı JS alertlerı calıstırabılmelı ve kapatabılmelı");

        //1. Test
        //- https://the-internet.herokuapp.com/javascript_alerts adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
         extentTest.info("kullanıcı herokuapp sayfasına gıder");
        //- 1.alert'e tiklayin
        WebElement ılkAlertElemntı=Driver.getDriver().findElement(By.xpath("//*[text()='Click for JS Alert']"));
        ılkAlertElemntı.click();
         extentTest.info("ılk alert butonuna click yapar");

        //- Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String expecetedalertYazısı="I am a JS Alert";
        String  actualAlertYazısı=Driver.getDriver().switchTo().alert().getText();

         SoftAssert softAssert =new SoftAssert();
        //  Assert.assertEquals(expecetedalertYazısı,actualAlertYazısı);
          softAssert.assertEquals(actualAlertYazısı,expecetedalertYazısı,"alerttekı yazı belırlenenden farklı");
         extentTest.info("soft aasert ile alert yazısının beklenen degere sahıp oldugunu test eder");
        //- OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
        extentTest.info("Alertı kapatır");
        

       //ALERT IN KAPATILDIGINI TEST EDELIM
          // Assert.assertTrue(ılkAlertElemntı.isEnabled());
         softAssert.assertTrue(ılkAlertElemntı.isEnabled(),"alert kapatılamadı");
         extentTest.info("soft asser ıle alertın kapatıldıgını test eder");
           Driver.getDriver();

           softAssert.assertAll();
           extentTest.info("soft asser ıle yapılan testlerın sonucunu raporlar");
            Driver.closeDriver();
            extentTest.info("sayfayı kapatır");
    }



























}
