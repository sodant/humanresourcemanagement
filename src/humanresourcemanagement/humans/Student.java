package humanresourcemanagement.humans;

import java.time.LocalDate;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Student extends Human {
	public int daysAbsent = 0;
	
	public Student(String name, LocalDate birthDate) {
		super(name, birthDate);
	}
	public void increaseAmountOfDaysAbsent(int amount) {
		daysAbsent += amount;
	}
	public void printDaysAbsent() {
		System.out.println(name + " has " + daysAbsent + " days absent");
	}
	
	private void getDaysAbsentFromXml()
	{
		Element student = HumanXmlAdapter.xmlHumans.getElementByAttribute("student", new Attribute("name", this.name));
		this.daysAbsent = Integer.parseInt(HumanXmlAdapter.xmlHumans.getAttributeValue("daysAbsent"));
	}
}
