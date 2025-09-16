package week3.day2;

public interface RBI {
	// rule 1 :
	// we can create object within the interface / there is no purpose for the main
	// method
	// rule 2:
	// within the interface we can only create the abstract method/ unimplemented
	// unimplemented method --> a method without the body
	//
	// accessModifier void identifierName(){ body of the method }
	public void kycMandatory();

	void repoRate();

	void bankRate();

	// default , static keyword--> implemented methods can be created
	static void internetBanking() {
		System.out.println("Through NPCI, RBI Overviews UPI and IMPS operation");
	}
}
