package edu.csupomona.cs356.visitor;

import java.util.List;

public class Car extends AutoElement {

	private List<AutoElement> components;

	public List<AutoElement> getComponents() {
		return components;
	}

	public void setComponents(List<AutoElement> components) {
		this.components = components;
	}
		
}
