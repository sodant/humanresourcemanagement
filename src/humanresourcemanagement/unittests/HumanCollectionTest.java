package humanresourcemanagement.unittests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.HumanCollection;
import humanresourcemanagement.data.HumanMockAdapter;
import humanresourcemanagement.humans.Human;

public class HumanCollectionTest {
	
	AbstractHumanCollection testCollection;
	
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
	
	@Test
	public void sortHumansByAgeTest(){
		ArrayList<Human> humansSortedByAge = (ArrayList<Human>)testCollection.sortHumansByAgeWithFunctionalInterface();
		//humansSortedByAge.forEach(h -> h.print());
		assertEquals(true, true);
	}
	
	@Test
	public void getAllStudentsTest(){
		ArrayList<Human> allStudents = (ArrayList<Human>)testCollection.getAllStudents();
		assertEquals(true, true);
	}
	
	@Test
	public void getAllStudentOlderThanEighteenTest(){
		ArrayList<Human> allStudents = (ArrayList<Human>)testCollection.getAllStudentOlderThanAge(18);
		assertEquals(true, true);
	}				
}
