package week2.day1;

public class LearnNestedForLoop {

	public static void main(String[] args) {

		// requirement is --> Print the star pattern--> 3X3 , // 1X3
		// condition -->
		for (int i = 0; i < 3; i++) { // outer loop
			for (int j = 0; j < 3; j++) {// inner loop
				if (j == 1) {
					System.out.print(" ");
//					break; // terminate the current loop
					continue;// skipped from the execution
				} else {
					System.out.print("*");
				}
			}
			System.out.println("");

		}

	}

}
