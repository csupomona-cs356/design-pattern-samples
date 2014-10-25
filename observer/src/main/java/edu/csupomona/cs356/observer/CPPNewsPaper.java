package edu.csupomona.cs356.observer;

import edu.csupomona.cs356.subject.BreakingNews;
import edu.csupomona.cs356.subject.GameScore;
import edu.csupomona.cs356.subject.Subject;

public class CPPNewsPaper implements Observer {

	private String latestHeadline;
	
	public void update(Subject subject) {
		if (subject instanceof GameScore) {
			latestHeadline = ((GameScore) subject).getName() 
					+ ((GameScore) subject).getScore();
			displayNews();
		} else if (subject instanceof BreakingNews) {
			latestHeadline = ((BreakingNews) subject).getNews();
			displayNews();
		}
	}
	
	private void displayNews() {
		System.out.println("CPP Newspaper Updated!!!");
		System.out.println(latestHeadline);
		System.out.println();
	}

}
