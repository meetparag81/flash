package SeleniumBasic;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotation 

{
	public class BeforetestandBeforemethod {

        @BeforeTest
         public void beforeTest() {
           System.out.println("@BeforeTest");
         } 
        @BeforeMethod
        public void beforemethod(){
               System.out.print("@BeforeMethod");
        }
        
        public void helper() {
                  System.out.println("Flow");
                }

                @Test
                public void toBeforeMethod() {
                  helper();
                  System.out.println("BeforeMethod");
                }

                @Test
                public void toBeforeTest() {
                  helper();
                  System.out.println("BeforeTest");
                }

}
}
