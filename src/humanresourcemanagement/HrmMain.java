package humanresourcemanagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import humanresourcemanagement.humans.Student;
import humanresourcemanagement.humans.Human;

public class HrmMain {

	public static void main(String[] args) 
	{
		HrmMain m = new HrmMain();
		//m.execute();
	}	
	
	private List<Human> allHumans = new ArrayList<Human>();
	private Predicate<Human> 	isStudent = (h) -> h instanceof Student,
								isOlderThan18 = (h) -> h.age > 18;
	private Comparator<Human> 	byAge = (h1, h2) -> h1.age - h2.age,
								byName = (h1, h2) -> h1.name.compareTo(h2.name);
	private Consumer<Human> 	print = (h) -> h.print();
	
	private void execute() {

		
		
		//Stream<Human> filtered = allHumans.stream().filter((s) -> s.age < 15);
		//filtered.forEach((h) -> h.print());
		System.out.println("All----------");
		allHumans.stream().forEach(print);;
		
		System.out.println("\nSorted by name---------- ");
		allHumans.stream().sorted(byName).forEach(print);
		
		System.out.println("\nSorted by age---------- ");
		allHumans.stream().sorted(byAge).forEach(print);
		
		System.out.println("\nStudents---------- ");
		allHumans.stream().filter(isStudent).forEach(print);
		
		System.out.println("\nStudents sorted by age---------- ");
		allHumans.stream().filter(isStudent).sorted(byAge).forEach(print);
		
		System.out.println("\nStudents sorted by name---------- ");
		allHumans.stream().filter(isStudent).sorted(byName).forEach(print);
		
		System.out.println("\nStudents sorted by name older than 18---------- ");
		allHumans.stream().filter(isStudent.and(isOlderThan18)).sorted(byAge).forEach(print);
		
		System.out.println("\nPrint students above 18 and store them in an ArrayList---------- ");
		
		ArrayList<Student> studentsAbove18 = new ArrayList<Student>();
		Consumer<Human> saveStudent = (h) -> studentsAbove18.add((Student) h),
						printStored = (h) -> System.out.println(h.name + " is stored");
						
		allHumans.stream().filter(isStudent.and(isOlderThan18)).sorted(byName).forEach(saveStudent.andThen(printStored));
		System.out.println("\n");
		
		Consumer<Student> showHomework = (s) -> s.showHomework(),
						  increaseHomeworkByRandomAmount = (s) -> s.increaseHomeworkBy(getRandom(10));
						  
		studentsAbove18.forEach(increaseHomeworkByRandomAmount.andThen(showHomework));
		System.out.println("\n");
		studentsAbove18.forEach(increaseHomeworkByRandomAmount.andThen(showHomework));
		System.out.println("\n");
		studentsAbove18.forEach(increaseHomeworkByRandomAmount.andThen(showHomework));
		System.out.println("\n");
		
		Comparator<Student> byMostHomework = (s1, s2) -> s2.amountOfHomework - s1.amountOfHomework;
		
		final int highestAmountOfHomework = studentsAbove18.stream().sorted(byMostHomework).findFirst().get().amountOfHomework;
		Predicate<Student> isALoser = (s) -> s.amountOfHomework == highestAmountOfHomework;
		Consumer<Student> printLoser = (s) -> System.out.println(s.name + " is a loser");
		
		System.out.println("The highest amount of homework is " + highestAmountOfHomework);
		studentsAbove18.stream().filter(isALoser).forEach(printLoser);
	}
	public int getRandom(int max) {
		return (int) (Math.random() * max + 1);
	}
	//Human
	//Xmlreader?
	
}
