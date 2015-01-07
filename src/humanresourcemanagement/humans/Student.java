package humanresourcemanagement.humans;

import java.time.LocalDate;

public class Student extends Human {
	public int amountOfHomework = 0;
	public Student(String name, LocalDate birthDate) {
		super(name, birthDate);
	}
	public void increaseHomeworkBy(int amount) {
		amountOfHomework += amount;
	}
	public void showHomework() {
		System.out.println(name + " has " + amountOfHomework + " homework");
	}
}
