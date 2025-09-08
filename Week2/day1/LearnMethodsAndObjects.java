package week2.day1;

public class LearnMethodsAndObjects {
	// global variable
	int i =0;
	// Compiler will assign "default" as the access modifier implicitly
	int addNum(int a, int b)  {
     int c;
     c= a+b;
     return c;
	}
	void name() {
	String nameOfMethod="addNum";
	System.out.println("the name of the method  is : "+ nameOfMethod);
	}
	
	public static void main(String[] args) {
		// Object --> Instance of the class---> TestLead --> QA Team member 
		// Object --> will only know the members of the class
		// Syntax :  segment 1 : Declaration : ClassName objectName ;
		LearnMethodsAndObjects  learnMethod ;
		// Syntax :  segment 2 : Initialization :objectionName = javaKeyword constructorOfTheClass();
		//                                       objectName = new constructorOfTheClass();
		learnMethod = new LearnMethodsAndObjects(); 
		System.out.println("Method and object");
		System.out.println(learnMethod.i); 
		//ctl+2, after while/ After the pop up --> Press the key 'L'
		int value = learnMethod.addNum(16, 25);
		System.out.println(value);
		System.out.println(learnMethod.addNum(100, 676));
		System.out.println(learnMethod.addNum(657576,932462));
		learnMethod.name();
	}

}
