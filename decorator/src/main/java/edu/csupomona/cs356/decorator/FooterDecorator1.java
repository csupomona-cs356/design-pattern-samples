package edu.csupomona.cs356.decorator;

public class FooterDecorator1 extends TicketDecorator {

	public FooterDecorator1(Component c) {
		super(c);
	}

	public void printTicket() {
		super.printTicket();
		this.printFooter();
	}

	public void printFooter() {
		System.out.println("## FOOTER One ##");
	}
}
