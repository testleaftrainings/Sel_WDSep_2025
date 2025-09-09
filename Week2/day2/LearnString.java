package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		String variableOne = "Testleaf"; // string constant pool 
		String variableTwo = new String("TestLeaf");// Heap Memory 
		if (variableOne.contains("Leaf")) {
			System.out.println("Both the values are same");
		}
		else {
			System.out.println("Both the values are not same");
		}
		int lengthOfVariableOne = variableOne.length();
		System.out.println(lengthOfVariableOne);
		char[] convertToCharacter = variableOne.toCharArray();
		// T-0, e-1, s-2, t-3, l-4, e-5, a-6, f-7
		System.out.println("I want to print the value in reversed order");
		for (int i = convertToCharacter.length-1; i >=0; i--) {
			System.out.println(convertToCharacter[i]);
		}
		System.out.println("** using charAt()**");
		char charAt = variableOne.charAt(3);
		System.out.println(charAt);
		System.out.println("** using split()**");
		String[] split = variableOne.split("e");
		//"Testleaf"--> 3 ; t , stl , af
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		
		
		
		
		
		}
	}


