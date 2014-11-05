package edu.csupomona.cs356;

import edu.csupomona.cs356.visitor.AutoElementVisitor;


public abstract class AutoElement {
	
	private String name;
	private int price;
	private String model;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}	
	
	abstract public void accept(AutoElementVisitor visitor);
	
}