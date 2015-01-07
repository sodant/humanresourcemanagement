package humanresourcemanagementdemo.unittests;

import org.junit.Before;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.data.HumanMockAdapter;
import humanresourcemanagement.unittests.AssignmentOneTest;
import humanresourcemanagementdemo.WorkshopHumanCollection;


public class WorkshopAssignmentThreeTest extends AssignmentOneTest{
	
	AbstractHumanCollection testCollection;
	
	@Before
	public void initialize()
	{
		HumanMockAdapter dataAdapter = new HumanMockAdapter();
		this.testCollection = new WorkshopHumanCollection(dataAdapter);
	}
}
