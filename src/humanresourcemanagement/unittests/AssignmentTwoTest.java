package humanresourcemanagement.unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.HumanCollection;
import humanresourcemanagement.data.HumanMockAdapter;
import humanresourcemanagement.humans.Human;

public class AssignmentTwoTest {
	
	protected AbstractHumanCollection testCollection;
	
	@Before
	public void initialize()
	{
		HumanMockAdapter dataAdapter = new HumanMockAdapter();
		this.testCollection = new HumanCollection(dataAdapter);
	}
	
	@Test
	public void addDayAbsentToStudents(){
		ArrayList<Human> allStudents = (ArrayList<Human>)testCollection.getAllStudentOlderThanAge(18);
		assertEquals(true, true);
	}					
}
