package humanresourcemanagement.humans;

public class HumanFactory {
	private static HumanFactory factory;

	public static HumanFactory getInstance() {
		if(factory == null) {
			return new HumanFactory();
		}else {
			return factory;
		}
	}
	public void createHuman(HumanType type) {
		System.out.println("test");
	}
}
