package humanresourcemanagement;

import humanresourcemanagement.data.IHumanDataAdapter;
import humanresourcemanagement.humans.Human;
import humanresourcemanagement.humans.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



/**
 * 
 * @author Mick Soudant
 * @author Rachèl Heimbach
 */
public class HumanCollection extends AbstractHumanCollection {
	
	private Predicate<Human> 	isStudent = (h) -> h instanceof Student;

	public HumanCollection(IHumanDataAdapter dataSource){		
		super(dataSource);
	}	
	
	public List<Human> sortHumansByName(){
		return this.humans.stream()
				.sorted((h1, h2) -> h1.name.compareTo(h2.name))
				.collect(Collectors.toList());
	}
	
	public List<Human> sortHumansByAgeWithFunctionalInterface(){
		
		Comparator<Human> byAge = (h1, h2) -> h1.age - h2.age;
		
		return this.humans.stream()
				.sorted(byAge)
				.collect(Collectors.toList());
	}

	public List<Human> getAllStudents(){

		return this.humans.stream()
				.filter(isStudent)
				.collect(Collectors.toList());
	}

	public List<Human> getAllStudentOlderThanAge(int age){

		return this.humans.stream()
				.filter(isStudent.and((h) -> h.age > age))
				.collect(Collectors.toList());
	}

	public List<Human> getAllHumansBornBeforeDateTimeWithLambdas(LocalDate date) {
		return this.humans.stream()
				.filter(a -> a.birthDate.isBefore(date))
						.collect(Collectors.toList());
	}
	
	public List<Human> addDayAbsentToStudents(LocalDate date) {
		return this.humans.stream()
				.filter(a -> a.birthDate.isBefore(date))
						.collect(Collectors.toList());
	}


}
