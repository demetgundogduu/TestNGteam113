package tests.TestNGFrameworkOlusturma;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {



    @Test(priority =57 )
    public void youtubeTesti(){

        System.out.println("Youtube");









    }
    @Test(priority = 0)@Ignore
    public void wiseTesti(){

        System.out.println("Wise quarter");










    }
    @Test(priority = 8)
    public void amazonTesti(){

        System.out.println("Amazon");








    }


























}
