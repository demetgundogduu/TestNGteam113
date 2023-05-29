package tests.day14TestNGFrameworkOlusturma;


import org.testng.annotations.Test;

public class C01_Priority {



        @Test(priority =57 )
       public void youtubeTesti(){

            System.out.println("Youtube");









       }
        @Test(groups = "minireg1")
     public void wiseTesti(){

            System.out.println("Wise quarter");










     }
      @Test(groups = {"smoke","minireg1"})
      public void amazonTesti(){

          System.out.println("Amazon");








      }







}
