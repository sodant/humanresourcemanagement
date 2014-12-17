package humanresourcemanagement.humans;

public class Student extends Human {
	public int amountOfHomework = 0;
	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void increaseHomeworkBy(int amount) {
		amountOfHomework += amount;
		//System.out.println(name + " homework increases with " + amount);
	}
	public void showHomework() {
		System.out.println(name + " has " + amountOfHomework + " homework");
	}
}
