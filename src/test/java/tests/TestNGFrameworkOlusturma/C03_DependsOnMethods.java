package tests.TestNGFrameworkOlusturma;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {


    @Test(priority =57 )
    public void youtubeTesti(){

        System.out.println("Youtube");

        Assert.assertTrue(8==0);









    }
    @Test(priority = 0)
    public void wiseTesti(){

        System.out.println("Wise quarter");










    }
    @Test (dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){

        System.out.println("Amazon");








    }








}
