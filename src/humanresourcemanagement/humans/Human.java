package humanresourcemanagement.humans;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.*;

public class Human {		
	public int age;
	public String name;
	public LocalDate birthDate;
	
	public Human(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;

		this.age = Period.between(birthDate, LocalDate.now()).getYears();
		System.out.println(age);
		//this.age = age;
	}

	public void print() {
		System.out.println(name + " " + age);
	}

}
