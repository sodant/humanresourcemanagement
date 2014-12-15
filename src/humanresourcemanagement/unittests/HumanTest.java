package humanresourcemanagement.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import humanresourcemanagement.Human;
import humanresourcemanagement.Human.Gender;

public class HumanTest {
	
	Human testSubject;
	
	@Before
	public void initialize()
	{
		testSubject = new Human("Mick", "Soudant", 23, Gender.MALE);		
	}
	
	@Test
	public void initializeTest() 
	{	
		assertEquals(true, true);
	}
	
}
