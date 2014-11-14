package edu.csupomona.cs356.visitor;

import edu.csupomona.cs356.Body;
import edu.csupomona.cs356.Car;
import edu.csupomona.cs356.Engine;
import edu.csupomona.cs356.Wheel;

public interface AutoElementVisitor {
	public void visitWheel(Wheel wheel);
	public void visitEngine(Engine engine);
	public void visitBody(Body body);
	public void visitCar(Car car);
}
