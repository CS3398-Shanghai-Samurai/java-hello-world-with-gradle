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
	
	
	
	   public void newestPBGreeterPass() 

   {

      g.setName("PlzPass");

      assertEquals(g.getName(),"PlzPass");

      assertEquals(g.sayHello(),"You Passed!");

   }
	
	
	
	
	
	public void newestPBGreeterFail() 
	{
   hopefully deleting brackets and adding random text will result in a build fail!

      g.setName("PlzPass");

      assertEquals(g.getName(),7657667);

      assertEquals(g.sayHello(),"You Didn't Pass!");

   9739823
	
	}


}
