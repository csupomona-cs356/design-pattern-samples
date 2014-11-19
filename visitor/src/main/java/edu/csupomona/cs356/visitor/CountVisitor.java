package edu.csupomona.cs356.visitor;

import edu.csupomona.cs356.Body;
import edu.csupomona.cs356.Car;
import edu.csupomona.cs356.Engine;
import edu.csupomona.cs356.Wheel;

public class CountVisitor implements AutoElementVisitor {

	private int counter = 0;

	public void visitWheel(Wheel wheel) {
		setCounter(getCounter() + 1);

	}

	public void visitEngine(Engine engine) {
		setCounter(getCounter() + 1);

	}

	public void visitBody(Body body) {
		setCounter(getCounter() + 1);

	}

	public void visitCar(Car car) {
		// TODO Auto-generated method stub

	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

}
