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
	
   @Test

   public void newtestJRFgreeterPass()

   {
      g.setName("JoshFlowers");
      assertEquals(g.getName(),"JoshFlowers");
      assertEquals(g.sayHello(),"Hello JoshFlowers!");
   }
	
   @Test

   public void newtestJRFgreeterPass()

   {
      g.setName("Planet Earth");
      assertEquals(g.getName(),"Planet Earth");
      assertEquals(g.sayHello(),"Hello JoshFlowers!");
   }

}
