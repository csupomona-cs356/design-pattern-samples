package edu.csupomona.cs356.decorator;

public class App {
    public static void main( String[] args ) {
        Component c =
        		new HeaderDecorator2(
        				new FooterDecorator1(
        						new FooterDecorator3(
        								new HeaderDecorator1(
        										new SalesTicket()) )));

        c.printTicket();
    }
}
