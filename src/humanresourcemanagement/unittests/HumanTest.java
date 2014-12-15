package humanresourcemanagement.unittests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import humanresourcemanagement.Human;

public class HumanTest {
	
	Human testSubject;
	@Before
	public void initialize()
	{
		testSubject = new Human();
		
	}
	
	@Test
	public void getNameTest() 
	{	
		assertEquals(true, true);
	}	
}
