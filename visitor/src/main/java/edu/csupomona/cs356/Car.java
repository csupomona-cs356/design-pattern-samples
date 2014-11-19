package edu.csupomona.cs356;

import java.util.List;

import edu.csupomona.cs356.visitor.AutoElementVisitor;

public class Car extends AutoElement {

	private List<AutoElement> components;

	public List<AutoElement> getComponents() {
		return components;
	}

	public void setComponents(List<AutoElement> components) {
		this.components = components;
	}

	@Override
	public void accept(AutoElementVisitor visitor) {
		// BFS
		for(AutoElement ae : components) {
			ae.accept(visitor);
		}
	}


}
