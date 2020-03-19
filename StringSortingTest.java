package com.example.demos;

import org.junit.Test;
import static org.junit.Assert.*;*/
public class StringSortingTest {
	
	
	  @Test 
	  public void testSortingString() {
	
	  String result = Main.sortString("me!.").toString();
	  
	  assertEquals("em", result);
	  
	  }
	 

}
