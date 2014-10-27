package edu.csupomona.cs356.singleton;

public class IClickerService {

	private static IClickerService instance;
	
	private String courseName;
	
	protected IClickerService() {
		super();
		System.out.println("Constructor called");
	}
	
	public static IClickerService getInstance() {
		System.out.println("Get the singleton instance");
		if (instance == null) {
			System.out.println("Create the singleton instance");
			instance = new IClickerService();
		}
		return instance;
	}
	
	public static IClickerService getInstance(String name) {
		if (instance == null) {
			if (name.equals("web")) {
				instance = new WebIClickerService();
			} else if (name.equals("mobile")) {
				instance = new MobileIClickerService();
			} else {
				instance = new IClickerService();
			}
		}
		return instance;
	}
	

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
