package HW22.JointCostsApp;
import java.util.*;

public class Action {
	private Person person = new Person();
;	private Group group = new Group();
	private ArrayList<Person> userGroup = group.getGroup();
	private Purchase pay = new Purchase(userGroup);
	
	
	public void actionPayment() {
		person.printableBalance(userGroup);
		
		System.out.print(" 1 - Заказать пиццу \n" + " 2 - Купить билеты в кино \n" + " 3 - Заказать подарок \n"
				+ "\nСделайте выбор: ");
		String choice = new Scanner(System.in).nextLine();

		switch (choice) {
		case "1": {
			pay.orderPizza();
			morePayment();
			break;
		}
		case "2": {
			pay.buyMovieTickets();
			morePayment();
			break;
		}
		case "3": {
			pay.raiseMoneyForAGift();
			morePayment();
		}
		default: {
			System.out.println("Повторите попытку еще раз.");
			actionPayment();
		}
		}
	}

	public void morePayment() {
		System.out.print(" [Д] - Да \n" + " [Н] - Нет" + "\nСделайте выбор: ");
		String choice = new Scanner(System.in).nextLine().toUpperCase();

		switch (choice) {
		case "Д": {
			actionPayment();
			break;
		}
		case "Н": {
			person.printableBalance(userGroup);
			System.exit(0);
		}
		default: {
			System.out.println("Повторите попытку еще раз.");
			morePayment();
		}
		}
	}

}
