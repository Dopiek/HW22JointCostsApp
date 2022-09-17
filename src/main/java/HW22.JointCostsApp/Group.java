package HW22.JointCostsApp;
import java.util.*;

public class Group {
	private ArrayList<Person> group = new ArrayList<Person>();

	Group() {
		this.group = creatingGroup();
	}

	public ArrayList<Person> getGroup() {
		return group;
	}

	public ArrayList<Person> creatingGroup() {

		System.out.print("Количество пользователей: ");
		int people = new Scanner(System.in).nextInt();

		for (int i = 0; i < people; i++) {
			group.add(new Person(i));

		}
		System.out.println();
		return group;
	}


}
