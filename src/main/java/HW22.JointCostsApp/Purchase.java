package HW22.JointCostsApp;
import java.util.*;

public class Purchase {
	private Payment payment = new Payment();
	private Debt debt = new Debt();

	private ArrayList<Person> usersGroup;

	private int price = 0;

	Purchase(ArrayList<Person> group) {
		this.usersGroup = group;
	}

	public void orderPizza() {
		price = (int) (300 * (usersGroup.size() / 1.5));
		System.out.println("Заказываем пиццу. Цена: " + price);

		Person person = payment.makePayment(usersGroup, price);
		debt.calculateDebt(usersGroup, person, price);
		debt.reliefDebt(usersGroup, person);
	}

	public void buyMovieTickets() {
		price = usersGroup.size() * 150;
		System.out.println("Покупаем билеты в кино, " + usersGroup.size() + "шт. Цена: " + price);

		Person person = payment.makePayment(usersGroup, price);
		debt.calculateDebt(usersGroup, person, price);
		debt.reliefDebt(usersGroup, person);
	}

	public void raiseMoneyForAGift() {
		price = (usersGroup.size() - 1) * 500;
		Person birthdayPerson = usersGroup.get(new Random().nextInt(usersGroup.size()));

		usersGroup.remove(birthdayPerson);

		System.out.println("У " + birthdayPerson.getName() + " день рождения. Цена подарка " + price);

		Person person = payment.makePayment(usersGroup, price);
		debt.calculateDebt(usersGroup, person, price);
		usersGroup.add(birthdayPerson);

		debt.reliefDebt(usersGroup, person);
	}
}
