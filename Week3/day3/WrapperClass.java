package week3.day3;

public class WrapperClass {

	public static void main(String[] args) {

		String price = "$40,000";
		String replacedPrice = price.replaceAll("\\D", "");
		System.out.println(replacedPrice);
		int int1 = Integer.parseInt(replacedPrice);
		System.out.println(int1);

	}

}
