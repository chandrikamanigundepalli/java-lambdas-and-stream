package Tunit.TUNIT;
import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {
	 @Test  
	    public void testmakeSubString(){  
	        assertEquals( "BCD",Building.makeSubString("ABCD"));  
	        assertEquals("CD",Building.makeSubString("AACD"));  
	        assertEquals( "BCD",Building.makeSubString("BACD"));  
	        assertEquals("BBAA",Building.makeSubString("BBAA"));  
	        assertEquals("BAA",Building.makeSubString("AABAA"));
	 }  
}
