package edu.csupomona.cs356;

import java.util.Arrays;

import edu.csupomona.cs356.visitor.CheckRecallVisitor;
import edu.csupomona.cs356.visitor.CountVisitor;

public class AppRunner {

	public static void main(String[] args) {
		Wheel w1 = new Wheel();
		w1.setName("wheel1");
		w1.setModel("Good Year");
		w1.setPrice(69);

		Wheel w2 = new Wheel();
		w2.setName("wheel2");
		w2.setModel("Good Year");
		w2.setPrice(69);

		Engine engine = new Engine();
		engine.setName("Turbo Engine");
		engine.setModel("GE");
		engine.setPrice(6000);

		Body body = new Body();
		body.setName("Red Body");
		body.setPrice(2000);

		Car car = new Car();
		car.setModel("Ford");
		car.setPrice(19000);
		car.setComponents(Arrays.asList(new AutoElement[]{w1, w2, engine, body}));

		//car.accept(new DoMaintenanceVisitor());
		car.accept(new CheckRecallVisitor());


		CountVisitor v = new CountVisitor();
		car.accept(v);
		System.out.println(v.getCounter());
	}

}
