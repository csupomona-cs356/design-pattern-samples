package edu.csupomona.cs356.singleton;

public class WebIClickerService extends IClickerService {

	@Override
	public void setCourseName(String courseName) {
		super.setCourseName("WEB: " + courseName);
	}

	
}
