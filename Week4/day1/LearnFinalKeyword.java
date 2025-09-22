package week4.day1;

public  class LearnFinalKeyword {
	
	// Inheritance is restricted 
	// final fields must be initialized
	// final fields cannot be overridden
	final String browser = "Google";
	
	public final void getBrowser() {
		System.out.println("Default browser is executed here");
	}
	
}
