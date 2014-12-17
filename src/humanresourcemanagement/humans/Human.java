package humanresourcemanagement.humans;
import java.time.LocalDateTime;


public class Human {
	
	
	public int age;
	public String name;
	private LocalDateTime birthDate;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	public void Render(/** **/){
		//presentation?
	}
	public void print() {
		System.out.println(name + " " + age);
	}

}
