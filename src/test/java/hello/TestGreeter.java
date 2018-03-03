package hello;



import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }
   
   public void newTestCTGreeterPass() 

   {

      g.setName("CharlesTabak2020");

      assertEquals(g.getName(),"CharlesTabak2020");

      assertEquals(g.sayHello(),"Hello CharlesTabak2020!");

   }
   
   public void newTestCTGreeterFail() 

   {

      g.setName("EasyFail");

      assertEquals(g.getName(),"BreasyPass");

      assertEquals(g.sayHello(),"Hello Joestar Loses!!");

   }
   

}