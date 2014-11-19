package edu.csupomona.cs356.singleton;

public class IClickerService {
	
	protected static IClickerService instance;
	
	protected IClickerService() { }
	
	public static IClickerService getInstance() {
		if (instance == null) {
			instance = new IClickerService();
		}
		return instance;
	}
	
	

	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
