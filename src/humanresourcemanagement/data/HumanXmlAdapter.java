package humanresourcemanagement.data;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import humanresourcemanagement.humans.Human;

public class HumanXmlAdapter implements IHumanDataAdapter {

	private XMLDocument xmlHumans;
	
	public HumanXmlAdapter(String filePath) {
		File path = new File(filePath);
		this.xmlHumans = new XMLDocument(path);		
	}
	public ArrayList<Human> getAllHumans() {
		NodeList[] allHumanElements = getAllHumanElements();
		return combineHumanLists(allHumanElements);
	}
	
	private ArrayList<Human> combineHumanLists(NodeList... humans)
	{
		ArrayList<Human> allHumans = null;
		for(int i=0; i<humans.length; i++)
		{
			if(humans[i] != null)
			{
				allHumans.addAll(getListOfHumans(humans[i]));
			}
		}
		return allHumans;
	}
	
	private NodeList[] getAllHumanElements()
	{
		return new NodeList[] {getHumanElements(), getStudentElements(), getTeacherElements()};
	}
	
	private NodeList getHumanElements()
	{
		return xmlHumans.getElementsByName("human");
	}
	
	private NodeList getStudentElements()
	{
		return xmlHumans.getElementsByName("student");
	}
	
	private NodeList getTeacherElements()
	{
		return xmlHumans.getElementsByName("teacher");
	}
	
	
	private ArrayList<Human> getListOfHumans(NodeList nodes)
	{
		Stream<Node> nodeStream = IntStream.range(0, nodes.getLength())
                .mapToObj(nodes::item);
		List<Human> l = nodeStream.map( n -> convertElementToHuman((Element) n))
				.collect(Collectors.toList());
		return new ArrayList<Human>(l);
	}

	private Human convertElementToHuman(Element element)
	{
		String name = xmlHumans.getAttributeValue(element, "name");
		String bDay = xmlHumans.getAttributeValue(element, "birthday");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate birthday = LocalDate.parse(bDay, formatter);
		switch (element.getTagName())
		case "human":
			return new Human(name, birthday);
		case "student":
			return new Student(name, birthday);
		case "teacher":
			return new Teacher(name, birthday);
		case "deafault":
			return null;
	}
}
