package edu.csupomona.cs356.decorator;

public class App {
    public static void main( String[] args ) {
    		SalesTicket salesTicket = new SalesTicket();
    		//salesTicket.printTicket();
    		
    		Component comp =
		    	new HeaderDecorator3(
			    				new FooterDecorator1(
			    						new HeaderDecorator1(salesTicket) ));
    		comp.printTicket();
    }
}
