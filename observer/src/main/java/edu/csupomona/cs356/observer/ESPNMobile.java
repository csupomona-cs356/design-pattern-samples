package edu.csupomona.cs356.observer;

import java.util.HashMap;
import java.util.Map;

import edu.csupomona.cs356.subject.GameScore;
import edu.csupomona.cs356.subject.Subject;

public class ESPNMobile implements Observer {

	private Map<String, String> scoreBoard = 
			new HashMap<String, String>();
	
	public void update(Subject subject) {
		if (subject instanceof GameScore) {
			scoreBoard.put(((GameScore) subject).getName(), 
					((GameScore) subject).getScore());
			displayScore();
		}
	}
	
	public void displayScore() {
		System.out.println("ESPN Mobile Updated!!!");
		System.out.println(scoreBoard);
		System.out.println();
	}

}
