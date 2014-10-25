package edu.csupomona.cs356.subject;

public class GameScore extends Subject {

	private String name;
	private String score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		notifyObservers();
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
		notifyObservers();
	}
	
}
