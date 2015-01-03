package humanresourcemanagement;

import humanresourcemanagement.data.IHumanDataAdapter;
import humanresourcemanagement.humans.Human;
import humanresourcemanagement.humans.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract class AbstractHumanCollection {
	
	protected ArrayList<Human> humans;		
	private static final long serialVersionUID = 548203084449125469L;

	public AbstractHumanCollection(IHumanDataAdapter dataSource){		
		this.humans = dataSource.getAllHumans();
	}	
	
	public abstract List<Human> sortHumansByName();
	
	public abstract List<Human> sortHumansByAge();
	
	public abstract List<Human> getAllStudents();
	
	public abstract List<Human> getAllStudentOlderThanEighteen();

	public abstract List<Human> getAllHumansBornBeforeDateTimeWithLambdas(LocalDate date);

}
