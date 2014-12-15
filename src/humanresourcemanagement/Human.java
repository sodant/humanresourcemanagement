package humanresourcemanagement;
import java.time.LocalDateTime;


public class Human {
	
	public enum Gender {
		MALE, FEMALE
	}
	
	private int age;
	private String firstName, lastName;
	private Gender gender;	
	private LocalDateTime birthDate;
	
	public Human (String firstName, String lastName, int age, Gender gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
		
	public void Render(/** **/){		
		//--		
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	private Gender getGender() {
		return gender;
	}

}
