package humanresourcemanagement.humans;

import java.time.LocalDate;

public class Teacher extends Human {

	public Teacher(String name, LocalDate birthDate) {
		super(name, birthDate);
	}		
	
	public void scoldStudent(Student target){
		
		System.out.println(target.name + "! You are late!");		
	}

}
