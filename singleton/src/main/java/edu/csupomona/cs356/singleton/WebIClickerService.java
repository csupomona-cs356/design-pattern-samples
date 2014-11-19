package edu.csupomona.cs356.singleton;

public class WebIClickerService extends IClickerService {

	public static IClickerService getInstance() {
		if (instance == null) {
			instance = new WebIClickerService();
		}
		return instance;
	}
	
	@Override
	public String getCourseName() {
		return "Web: " + super.getCourseName();
	}

	
}
