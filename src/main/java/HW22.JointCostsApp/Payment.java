package HW22.JointCostsApp;
import java.util.*;

public class Payment {
	
	public Person makePayment(ArrayList<Person> group, int price) {
		Person person = group.get(new Random().nextInt(group.size()));

		if (person.getBalance() > price) {
			person.setBalance(person.getBalance() - price);
			System.out.println(person.getName() + " оплачивает...\n");
		} else
			makePayment(group, price);	
		
		return person;
	}
	
	

}
