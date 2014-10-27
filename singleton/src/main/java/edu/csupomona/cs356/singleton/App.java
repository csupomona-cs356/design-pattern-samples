package edu.csupomona.cs356.singleton;


public class App {
    public static void main( String[] args ) {
    	
    		  IClickerService.getInstance("mobile");
    		  
    		  IClickerService.getInstance().setCourseName("CS356");
    		  System.out.println(IClickerService.getInstance().getCourseName());
    	
    }
}
