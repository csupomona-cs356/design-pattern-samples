package edu.csupomona.cs356.visitor;

import edu.csupomona.cs356.Body;
import edu.csupomona.cs356.Car;
import edu.csupomona.cs356.Engine;
import edu.csupomona.cs356.Wheel;

public class CheckRecallVisitor implements AutoElementVisitor {

	public void visitWheel(Wheel wheel) {
		System.out.println("Checking recall for wheel " + wheel.getModel());

	}

	public void visitEngine(Engine engine) {
		System.out.println("Checking recall for engine " + engine.getModel());

	}

	public void visitBody(Body body) {
		System.out.println("Checking recall for body " + body.getModel());

	}

	public void visitCar(Car car) {
		System.out.println("Checking recall for car " + car.getModel());

	}

}
