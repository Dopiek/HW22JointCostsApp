package HW22.JointCostsApp;
import java.util.ArrayList;

public class Person {
	private String name;
	private int balance;
	private int debt = 0;

	Person(int userNumber) {
		this.name = generationName(userNumber);
		this.balance = generetionBalance();
	}

	Person() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int wallet) {
		this.balance = wallet;
	}
		
	public int getDebt () {
		return debt;
	}
	
	public void setDebt(int debt) {
		this.debt = debt;
	}
	
	public String generationName(int sizeGroup) {		
		return "Пользователь_" + (sizeGroup + 1);
	}

	public int generetionBalance() {
		int[] money = { 3000, 4000, 5000 };

		return money[(int) Math.floor(Math.random() * money.length)];
	}
	
	public void printableBalance(ArrayList<Person> userGroup) {
		System.out.println("Имя		Баланс	Долг");

		for (int i = 0; i < userGroup.size(); i++) {
			System.out.println(userGroup.get(i).getName() + "	" + userGroup.get(i).getBalance() + "	" + userGroup.get(i).getDebt());
		}
		System.out.println();
	}
}
