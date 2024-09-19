package Inheritance;

import java.util.Scanner;

class Hdfc {
	private int customerid;
	public String customername;
	float balance = 1000000.6f;

	public void withdraw(float amountwithdraw) {
		balance = balance - amountwithdraw;
		System.out.println("updated balance is " + balance);
	}

	public void deposit(float amountdeposit) {
		balance = balance + amountdeposit;
		System.out.println("updated balance is " + balance);

	}

	public void nominee(String addnominee) {
		System.out.println("your nominee name has successfully stored");
	}

	public void payee(String addpayee) {
		System.out.println("payee name successfully stored");
	}

}

//child class
class HdfcMumbaiBranch extends Hdfc {

}

public class Polymorphism {

	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		System.out.println("Welcome to hdfc bank! we are help to youuu:::");
		System.out.println("please press 1 for withdraw:::");
		System.out.println("please press 2 for Deposit::");
		System.out.println("please press 3 for Adding nominee to your account:::");
		System.out.println("please press 4 for Adding payye to your Account:::");
		System.out.println("please press 5 for exit");
		Scanner keyboard = new Scanner(System.in);
		int choice;
		choice = keyboard.nextInt();
		System.out.println("Thank you!! you have choosen option " + choice);
		if (choice == 1) {
			System.out.println("please enter the amount to withdraw");
			float amountwithdraw = keyboard.nextFloat();
			obj.withdraw(amountwithdraw);
		} else if (choice == 2) {
			System.out.println("please enter the amount to deposit");
			float amountdeposit = keyboard.nextFloat();
			obj.deposit(amountdeposit);
		} else if (choice == 3) {
			System.out.println("please enter nominee name");
			String addnominee = keyboard.next();
			obj.nominee(addnominee);
		} else if (choice == 4) {
			System.out.println("please enter payye name");
			String addpayye = keyboard.next();
			obj.payee(addpayye);
		} else if (choice == 5) {
			System.out.println("thank you for choosing HDfc bank Service.....we were happy to feel you....");
		}
	}

}
