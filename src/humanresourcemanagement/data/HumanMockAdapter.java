package humanresourcemanagement.data;

import java.util.ArrayList;

import humanresourcemanagement.humans.Human;
import humanresourcemanagement.humans.Student;

public class HumanMockAdapter implements IHumanDataAdapter {
	
	public ArrayList<Human> getAllHumans() {
		
		ArrayList<Human> humans = new ArrayList<Human>();
		humans.add(new Student("Rachèl", 23));
		humans.add(new Student("Mick", 20));
		humans.add(new Student("Lex", 34));
		humans.add(new Student("Lars", 33));
		humans.add(new Student("Jenny", 19));
		
		return humans;		
	}

}
