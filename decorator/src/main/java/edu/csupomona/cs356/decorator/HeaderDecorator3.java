package edu.csupomona.cs356.decorator;

public class HeaderDecorator3 extends TicketDecorator {

	  public HeaderDecorator3(Component c) {
	    super(c);
	  }

	  public void printTicket() {	    
	    super.printTicket();
	    this.printHeader();
	  }

	  public void printHeader() {
	    System.out.println("@@ Header Three @@");
	  }
	}
