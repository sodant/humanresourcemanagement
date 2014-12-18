package humanresourcemanagementdemo.unittests;

import org.junit.Before;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.data.HumanMockAdapter;
import humanresourcemanagement.unittests.HumanCollectionTest;
import humanresourcemanagementdemo.WorkshopHumanCollection;


public class WorkshopHumanCollectionTest extends HumanCollectionTest{
	
	AbstractHumanCollection testCollection;
	
	@Before
	public void initialize()
	{
		HumanMockAdapter dataAdapter = new HumanMockAdapter();
		this.testCollection = new WorkshopHumanCollection(dataAdapter);
	}
}
