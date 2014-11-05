package edu.csupomona.cs356;

import edu.csupomona.cs356.visitor.AutoElementVisitor;


public class Wheel extends AutoElement {

	@Override
	public void accept(AutoElementVisitor visitor) {
		visitor.visitWheel(this);
		
	}

	
}
