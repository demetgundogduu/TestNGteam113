package tests.day14TestNGFrameworkOlusturma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utililities.Driver;
import utililities.ReusableMethods;

public class C04_DriverIlkTest {



    @Test
    public void test01(){
        //AMAZONA ana sayfaya  GİT

        Driver.getDriver().get("https://www.amazon.com");

        //NUTELLA ICIN ARAMA YAP
        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //ARAMAsonuclarını nutella kelımesı ıcerdıgını test edın
        WebElement sonucElemeti=Driver.getDriver().findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String expectedIcerik="Nutella";
        String actualSonucYazısı=sonucElemeti.getText();
        Assert.assertTrue(actualSonucYazısı.contains(expectedIcerik));
        ReusableMethods.bekle(5);

       Driver.closeDriver();







    }















}
