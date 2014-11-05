package edu.csupomona.cs356;

import edu.csupomona.cs356.visitor.AutoElementVisitor;


public class Body extends AutoElement {

	@Override
	public void accept(AutoElementVisitor visitor) {
		visitor.visitBody(this);		
	}

	
}
