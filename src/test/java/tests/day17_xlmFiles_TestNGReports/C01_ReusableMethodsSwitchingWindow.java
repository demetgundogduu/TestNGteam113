package tests.day17_xlmFiles_TestNGReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utililities.Driver;
import utililities.ReusableMethods;

import java.util.Set;

public class C01_ReusableMethodsSwitchingWindow {
    @Test
    public void test01(){


        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        SoftAssert softAssert =new SoftAssert();

        WebElement openıngYazısı=Driver.getDriver().findElement(By.tagName("h3"));
        String expectedIcerık="Opening a new window";
        String actualIcerık=openıngYazısı.getText();


       softAssert.assertEquals(expectedIcerık,actualIcerık,"ilk sayfa texti Opening a new window degıl");

        String ılkSayafanınWHD=  Driver.getDriver().getWindowHandle();


        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String actualTitle=Driver.getDriver().getTitle();

      softAssert.assertEquals(expectedTitle,actualTitle,"ıkıncı sayfanın tıtle The Internet degıl  ");


        //● Click Here butonuna basın.
        WebElement clickButonu= Driver.getDriver().findElement(By.xpath("(//a[@target='_blank'])[1]"));
        clickButonu.click();
        //43 .satır ıtıbarı ıle yenı wındow acıldı
        //artık 2 wındow vae


        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu
        //dogrulayin.

        ReusableMethods.switchToWindow("New Window");

        String expectedNewTitle="New Window";
        String actualNewTitle=Driver.getDriver().getTitle();
        softAssert.assertEquals(expectedNewTitle,actualNewTitle);
        //● Sayfadaki textin “New Window” olduğunu doğrulayın.

        WebElement newWindowyaziElementi= Driver.getDriver().findElement(By.tagName("h3"));
        String expectedYazi = "New Window";
        String actualYazi = newWindowyaziElementi.getText();
        softAssert.assertEquals(expectedYazi,actualYazi);

        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet”
        //olduğunu doğrulayın


        Driver.getDriver().switchTo().window(ılkSayafanınWHD);
        expectedTitle="The Internet";
        actualTitle=Driver.getDriver().getTitle();
        softAssert.assertEquals(expectedTitle,actualTitle);



       softAssert.assertAll();



          Driver.quitDriver();












    }









}
