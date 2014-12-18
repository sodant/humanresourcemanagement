package humanresourcemanagement.humans;
import java.time.LocalDateTime;

public class Human {		
	public int age;
	public String name;
	public LocalDateTime birthDate;	
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(name + " " + age);
	}

}
