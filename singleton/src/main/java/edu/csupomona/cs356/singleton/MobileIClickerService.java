package edu.csupomona.cs356.singleton;

public class MobileIClickerService extends IClickerService {

	public static IClickerService getInstance() {
		if (instance == null) {
			instance = new MobileIClickerService();
		}
		return instance;
	}
	
	@Override
	public String getCourseName() {
		return "Mobile: " + super.getCourseName();
	}

	
}
