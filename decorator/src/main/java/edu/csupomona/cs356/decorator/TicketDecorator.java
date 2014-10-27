package edu.csupomona.cs356.decorator;

public abstract class TicketDecorator implements Component {

	private Component component;

	public TicketDecorator(Component c) {
		component = c;
	}

	public void printTicket() {
		if (component != null) {
			component.printTicket();
		}
	}
}
