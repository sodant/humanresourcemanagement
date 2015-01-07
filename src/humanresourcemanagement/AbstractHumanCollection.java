package humanresourcemanagement;

import humanresourcemanagement.data.IHumanDataAdapter;
import humanresourcemanagement.humans.Human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHumanCollection {
	
	protected ArrayList<Human> humans;		

	public AbstractHumanCollection(IHumanDataAdapter dataSource){		
		this.humans = dataSource.getAllHumans();
	}	
	
	public abstract List<Human> sortHumansByName();
	
	public abstract List<Human> sortHumansByAgeWithFunctionalInterface();
	
	public abstract List<Human> getAllStudentsWithFunctionalInterface();
	
	public abstract List<Human> getAllStudentOlderThanAge(int age);
	
	public abstract List<Human> getAllHumansBornBeforeDateTimeWithLambdas(LocalDate date);

}
