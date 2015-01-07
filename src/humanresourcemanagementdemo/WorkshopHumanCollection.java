package humanresourcemanagementdemo;

import java.time.LocalDate;
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
	public List<Human> sortHumansByAgeWithFunctionalInterface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Human> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Human> getAllStudentOlderThanAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Human> getAllHumansBornBeforeDateTimeWithLambdas(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}


}
