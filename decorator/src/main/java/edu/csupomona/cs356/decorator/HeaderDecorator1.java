package edu.csupomona.cs356.decorator;

public class HeaderDecorator1 extends TicketDecorator {

	public HeaderDecorator1(Component c) {
		super(c);
	}

	public void printTicket() {
		this.printHeader();
		super.printTicket();
	}

	public void printHeader() {
		System.out.println("@@ Header One @@");
	}
}
