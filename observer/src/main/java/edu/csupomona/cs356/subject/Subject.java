package edu.csupomona.cs356.subject;

import java.util.ArrayList;
import java.util.List;

import edu.csupomona.cs356.observer.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer ob : observers) {
			ob.update(this);
		}
	}
}
