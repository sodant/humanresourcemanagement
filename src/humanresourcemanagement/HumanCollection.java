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
	
	
	//  	 ___           _______.     _______. __    _______ .__   __. .___  ___.  _______ .__   __. .___________.
	// 		/   \         /       |    /       ||  |  /  _____||  \ |  | |   \/   | |   ____||  \ |  | |           |
	//	   /  ^  \       |   (----`   |   (----`|  | |  |  __  |   \|  | |  \  /  | |  |__   |   \|  | `---|  |----`
	//	  /  /_\  \       \   \        \   \    |  | |  | |_ | |  . `  | |  |\/|  | |   __|  |  . `  |     |  |     
	//	 /  _____  \  .----)   |   .----)   |   |  | |  |__| | |  |\   | |  |  |  | |  |____ |  |\   |     |  |     
	//	/__/     \__\ |_______/    |_______/    |__|  \______| |__| \__| |__|  |__| |_______||__| \__|     |__|     
	//	  ______   .__   __.  _______                                                                               
	//	 /  __  \  |  \ |  | |   ____|                                                                              
	//	|  |  |  | |   \|  | |  |__                                                                                 
	//	|  |  |  | |  . `  | |   __|                                                                                
	//	|  `--'  | |  |\   | |  |____                                                                               
	//	 \______/  |__| \__| |_______|                                                                              
	//                                                                                                             
	/**
	 * Lambdas
	 * Method references
	 * Functional Interfaces
	 * Basic streams.
	 */
		
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

	public List<Human> getAllStudentsWithFunctionalInterface(){

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
	
	
	//  	 ___           _______.     _______. __    _______ .__   __. .___  ___.  _______ .__   __. .___________.
	// 		/   \         /       |    /       ||  |  /  _____||  \ |  | |   \/   | |   ____||  \ |  | |           |
	//	   /  ^  \       |   (----`   |   (----`|  | |  |  __  |   \|  | |  \  /  | |  |__   |   \|  | `---|  |----`
	//	  /  /_\  \       \   \        \   \    |  | |  | |_ | |  . `  | |  |\/|  | |   __|  |  . `  |     |  |     
	//	 /  _____  \  .----)   |   .----)   |   |  | |  |__| | |  |\   | |  |  |  | |  |____ |  |\   |     |  |     
	//	/__/     \__\ |_______/    |_______/    |__|  \______| |__| \__| |__|  |__| |_______||__| \__|     |__|     
	//	.___________.____    __    ____  ______                                                                     
	//	|           |\   \  /  \  /   / /  __  \                                                                    
	//	`---|  |----` \   \/    \/   / |  |  |  |                                                                   
	// 		|  |       \            /  |  |  |  |                                                                   
	// 		|  |        \    /\    /   |  `--'  |                                                                   
	// 		|__|         \__/  \__/     \______/          
	//  
	/**
	 * Advanced streams
	 */
	
	public List<Human> addDayAbsentToStudents(LocalDate date) {
		return this.humans.stream()
				.filter(a -> a.birthDate.isBefore(date))
						.collect(Collectors.toList());
	}
	
	//  	 ___           _______.     _______. __    _______ .__   __. .___  ___.  _______ .__   __. .___________.
	// 		/   \         /       |    /       ||  |  /  _____||  \ |  | |   \/   | |   ____||  \ |  | |           |
	//	   /  ^  \       |   (----`   |   (----`|  | |  |  __  |   \|  | |  \  /  | |  |__   |   \|  | `---|  |----`
	//	  /  /_\  \       \   \        \   \    |  | |  | |_ | |  . `  | |  |\/|  | |   __|  |  . `  |     |  |     
	//	 /  _____  \  .----)   |   .----)   |   |  | |  |__| | |  |\   | |  |  |  | |  |____ |  |\   |     |  |     
	//	/__/     \__\ |_______/    |_______/    |__|  \______| |__| \__| |__|  |__| |_______||__| \__|     |__|     
	//	.___________. __    __  .______       _______  _______                                                      
	//	|           ||  |  |  | |   _  \     |   ____||   ____|                                                     
	//	`---|  |----`|  |__|  | |  |_)  |    |  |__   |  |__                                                        
	// 		|  |     |   __   | |      /     |   __|  |   __|                                                       
	// 		|  |     |  |  |  | |  |\  \----.|  |____ |  |____                                                      
	// 		|__|     |__|  |__| | _| `._____||_______||_______|                                                     
	//
	/**
	 * Optionals
	 */


}
