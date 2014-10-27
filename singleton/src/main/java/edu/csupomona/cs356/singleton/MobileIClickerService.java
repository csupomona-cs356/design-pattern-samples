package edu.csupomona.cs356.singleton;

public class MobileIClickerService extends IClickerService {

	@Override
	public void setCourseName(String courseName) {
		super.setCourseName("MOBILE: " + courseName);
	}
}
