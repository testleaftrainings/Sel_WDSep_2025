package week3.day2;

public class SBI extends SbiHQ {
	// extends -> one class with another class
	// implements -- interface with the concrete class

	public static void main(String[] args) {
		SBI branch = new SBI();
		branch.kycMandatory();
		branch.bankRate();
		branch.repoRate();
		branch.retailLoanApproval();
		branch.sbiHeadLocation();
		RBI.internetBanking();

	}

	@Override
	public void kycMandatory() {
		System.out.println("Any one ID proof is to be submitted to open a new account");
	}

	@Override
	public void repoRate() {
		System.out.println("current repo rate is 5.50%");
	}

	@Override
	public void bankRate() {
		System.out.println("current repo rate is 5.75%");

	}

	@Override
	void retailLoanApproval() {
		System.out.println("if any retail loan amount below 10 cr, Approval should be provided by the branch Manager");
	}

}
