package edu.csupomona.cs356.adapter;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        SubmissionManager manager = new CompBasedSubmissionManager();
        manager.add("01");
        manager.add("02");
        manager.add("03");
        manager.add("01");
        
        manager.addAll(
        		Arrays.asList(new String[]{"05", "06", "07"}));
        
        System.out.println(manager.getNumOfAttemptedSubmissions());
    }
}
