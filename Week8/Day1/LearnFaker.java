package week8.day1;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
		// Faker-Class
           Faker fakeOptions = new Faker();

		// To generate email
		String emailAddress = fakeOptions.internet().emailAddress();
		System.out.println(emailAddress);

        // PhoneNumber
		String cellPhone = fakeOptions.phoneNumber().cellPhone();
		System.out.println(cellPhone);

		// FirstName
		String name = fakeOptions.company().name();
		System.out.println(name);

	}

}
