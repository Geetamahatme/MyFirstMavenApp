package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	   Calculator obj=new Calculator();
	   @Test
       public void testFindBig()
       {
		   assertEquals(20,obj.findBig(10, 20));
       }
	   @Test
	   public void testFindBig1()
       {
		   assertEquals(20,obj.findBig(10, 20));
       }
	   @Test
	   public void testFindBig2()
       {
		   assertEquals(20,obj.findBig(10, 20));
       }

}
