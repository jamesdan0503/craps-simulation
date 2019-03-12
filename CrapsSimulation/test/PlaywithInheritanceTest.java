import static org.junit.Assert.*;

import org.junit.Test;

public class PlaywithInheritanceTest
{
	PlayWithInheritance PI = new PlayWithInheritance();
	
	@Test
	public void test_Inheritance() 
	{
		assertEquals("Die", PlayWithInheritance.testStatic());
	}
}
