package humanresourcemanagementdemo;

import java.util.List;

import humanresourcemanagement.AbstractHumanCollection;
import humanresourcemanagement.data.IHumanDataAdapter;
import humanresourcemanagement.humans.Human;

public class WorkshopHumanCollection extends AbstractHumanCollection {

	public WorkshopHumanCollection(IHumanDataAdapter dataSource) {
		super(dataSource);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Human> sortHumansByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Human> sortHumansByAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Human> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Human> getAllStudentOlderThanEighteen() {
		// TODO Auto-generated method stub
		return null;
	}

}
