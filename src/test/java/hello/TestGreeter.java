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
      g.setName("Josh");
      assertEquals(g.getName(),"Josh");
      assertEquals(g.sayHello(),"Hello Josh!");
	   
      g.setName("Josh");
      assertNotEqual(g.getName(),"Josh");
      assertNotEqual(g.sayHello(),"Hello Josh!");
	   
      g.setName("Josh");
      assertEquals(g.getName(),"Josh");
      assertEquals(g.sayHello(),"Hello Josh!");
   }

}
