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

   public void newestIVGreeterPass() 

   {

      g.setName("PassingTest");

      assertEquals(g.getName(),"PassingTest");

      assertEquals(g.sayHello(),"Immanuel Finally Passed!");

   }
	
   public void newsetIVGreeterFail()
	   
   {
      //g.setName("PassingTest");
	   
      assertEquals(g.getName(),"Failing Test");
	   
      assertEquals(g.sayHello(),"Immanuel Finally Failed!");
    }
}
