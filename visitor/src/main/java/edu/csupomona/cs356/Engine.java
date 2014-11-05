package edu.csupomona.cs356;

import edu.csupomona.cs356.visitor.AutoElementVisitor;


public class Engine extends AutoElement {

	@Override
	public void accept(AutoElementVisitor visitor) {
		visitor.visitEngine(this);
		
	}
	
}
