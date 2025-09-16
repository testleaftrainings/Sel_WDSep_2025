package week3.day2;

public class PayPal extends CreditModule {
	
	@Override
	public void accountCredits(double chequeTransfer) {

		System.out.println("The amount has been deposited via cheque  :"+ chequeTransfer);
	}
	public static void main(String[] args) {
		PayPal credits = new PayPal();
		credits.accountCredits(1000000.00);
	}
	
	

}
