package edu.csupomona.cs356.decorator;

public class SalesTicket implements Component {

	public void printTicket() {
		System.out.println("Customer: Bob");
		System.out.println("The sales ticket itself");
		System.out.println("Total: $123.45");
	}
}
