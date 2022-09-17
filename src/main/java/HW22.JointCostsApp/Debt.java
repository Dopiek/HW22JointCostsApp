package HW22.JointCostsApp;
import java.util.ArrayList;

public class Debt {

	public void calculateDebt(ArrayList<Person> group, Person person, int price) {
		ArrayList<Person> debtors = new ArrayList<Person>();
		int debt = 0;
		int counter = 0;

		for (int i = 0; i < group.size(); i++) {
			if (group.get(i) != person) {
				debtors.add(group.get(i));
				counter++;
			} else
				counter++;
		}

		debt = (int) price / counter;

		for (int i = 0; i < debtors.size(); i++) {
			debtors.get(i).setDebt(debtors.get(i).getDebt() + debt);
		}
		
		person.printableBalance(group);
	}

	public void reliefDebt(ArrayList<Person> group, Person person) {
		System.out.println("\n" + person.getName() + " получает средства \n");
		int counterDebt = 0;
		
		for (int i = 0; i < group.size(); i++) {
			if (group.get(i) != person) {
				counterDebt += group.get(i).getDebt();
				group.get(i).setDebt(0);
			}
		}
		
		person.setBalance(person.getBalance() + counterDebt);
		person.printableBalance(group);
	}
}
