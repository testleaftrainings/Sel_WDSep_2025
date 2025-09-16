package week3.day2;

public class CreditModule {
	double currentBalance = 10000;

	public void accountCredits() {
		System.out.println("It displays the current balance of the account");
		System.out.println("current balance of the account is " + currentBalance);
	}

	// To build the credit system - which accepts multiple mode of transactions
	// cdmDeposit
	public void accountCredits(int cdmDeposit) {
		System.out.println("The cash has been deposited through CDM : " + cdmDeposit);
		currentBalance = currentBalance + cdmDeposit;
		accountCredits();
	}

	// internetBanking
	public void accountCredits(double internetBanking) {
		System.out.println("The Amount has been transferred through NEFT : " + internetBanking);
		currentBalance = currentBalance + internetBanking;
		accountCredits();
	}

	// forex : String currency name, double conversion rate , double
	// transferredAmount
	public void accountCredits(String currencyname, double conversionrate, double transferredAmount) {
		double convertedAmount;
		System.out.println("Currency of the donor is : " + currencyname);
		convertedAmount = transferredAmount * conversionrate;
		System.out.println("The Amount has been transferred through FOREX : " + convertedAmount);
		currentBalance = currentBalance + convertedAmount;
		accountCredits();
	}

	public static void main(String[] args) {
		CreditModule credits = new CreditModule();
		credits.accountCredits();
		credits.accountCredits(20000);
		credits.accountCredits(55555.55);
		credits.accountCredits("USD", 88.11, 99.99);
	}

}
