package humanresourcemanagementdemo.unittests;

import org.junit.Before;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.data.HumanMockAdapter;
import humanresourcemanagement.unittests.AssignmentOneTest;
import humanresourcemanagement.unittests.AssignmentThreeTest;
import humanresourcemanagementdemo.WorkshopHumanCollection;


public class WorkshopAssignmentThreeTest extends AssignmentThreeTest{
	
	@Before
	public void initialize()
	{
		HumanMockAdapter dataAdapter = new HumanMockAdapter();
		this.testCollection = new WorkshopHumanCollection(dataAdapter);
	}
}
