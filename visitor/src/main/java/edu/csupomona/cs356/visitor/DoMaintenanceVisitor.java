package edu.csupomona.cs356.visitor;

import edu.csupomona.cs356.Body;
import edu.csupomona.cs356.Car;
import edu.csupomona.cs356.Engine;
import edu.csupomona.cs356.Wheel;

public class DoMaintenanceVisitor implements AutoElementVisitor {

	public void visitWheel(Wheel wheel) {
		System.out.println("Do maintenance for wheel");

	}

	public void visitEngine(Engine engine) {
		System.out.println("Do maintenance for engine");

	}

	public void visitBody(Body body) {
		System.out.println("Do maintenance for body");

	}

	public void visitCar(Car car) {
		System.out.println("Do maintenance for car");

	}

}
