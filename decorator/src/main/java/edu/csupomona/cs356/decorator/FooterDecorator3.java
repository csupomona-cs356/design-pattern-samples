package edu.csupomona.cs356.decorator;

public class FooterDecorator3 extends TicketDecorator {

	public FooterDecorator3(Component c) {
		super(c);
	}

	public void printTicket() {
		super.printTicket();
		this.printFooter();
	}

	public void printFooter() {
		System.out.println("## FOOTER Three ##");
	}
}
