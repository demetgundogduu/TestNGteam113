package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.YoutubePages;
import utililities.ConfigReader;
import utililities.Driver;

public class C07_youtubeTesti {
       @Test
    public void test01(){

        //1) https://www.youtube.com adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        //2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
         String actualyoutubetitle=Driver.getDriver().getTitle();
         String expectedTitle=ConfigReader.getProperty("youtubeTitle");
        Assert.assertTrue(actualyoutubetitle.contains(expectedTitle));

        //○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
        YoutubePages youtubePages =new YoutubePages();
        Assert.assertTrue(youtubePages.youtubeResım.isDisplayed());
        //○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        Assert.assertTrue(youtubePages.youtubeResım.isEnabled());
        //○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin //
           expectedTitle= ConfigReader.getProperty("youtubeTitle2");
         Assert.assertFalse(actualyoutubetitle.contains(expectedTitle));

         Driver.closeDriver();























    }


}
