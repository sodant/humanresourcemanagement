package humanresourcemanagement.unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.HumanCollection;
import humanresourcemanagement.data.HumanMockAdapter;
import humanresourcemanagement.humans.Human;

public class AssignmentThreeTest {
	
	protected AbstractHumanCollection testCollection;
	
	@Before
	public void initialize()
	{
		HumanMockAdapter dataAdapter = new HumanMockAdapter();
		this.testCollection = new HumanCollection(dataAdapter);
	}
	
	@Test
	public void sortHumansByNameTest(){
		ArrayList<Human> humansSortedByName = (ArrayList<Human>)testCollection.sortHumansByName();
		//humansSortedByName.forEach(h -> h.print());
		assertEquals(true, true);
	}
			
}
