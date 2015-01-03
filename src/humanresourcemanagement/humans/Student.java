package humanresourcemanagement.humans;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student extends Human {
	public int amountOfHomework = 0;
	public Student(String name, LocalDate birthDate) {
		super(name, birthDate);
		// TODO Auto-generated constructor stub
		// I'm a green banana! Do not eat me yet!
	}
	public void increaseHomeworkBy(int amount) {
		amountOfHomework += amount;
		//System.out.println(name + " homework increases with " + amount);
	}
	public void showHomework() {
		System.out.println(name + " has " + amountOfHomework + " homework");
	}
}
