package edu.csupomona.cs356.decorator;

public class FooterDecorator2 extends TicketDecorator {

	public FooterDecorator2(Component c) {
		super(c);
	}

	public void printTicket() {
		super.printTicket();
		this.printFooter();
	}

	public void printFooter() {
		System.out.println("## FOOTER Two ##");
	}
}
