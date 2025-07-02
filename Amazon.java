package week4.day1;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		
		System.out.println("Cash on Delivery");
		recordPaymentDetails("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
		
		System.out.println("UPI payments");
		recordPaymentDetails("UPI Payments");
		
	}

	@Override
	public void cardPayments() {
		
		System.out.println("Card Payments");
		recordPaymentDetails("Card type Payments");
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking");
		recordPaymentDetails("Internet Banking Transaction");
		
	}

	public static void main(String[]args)
	{
		Amazon amazonPayment=new Amazon();
		
		amazonPayment.cashOnDelivery();
		amazonPayment.cardPayments();
		amazonPayment.internetBanking();
		amazonPayment.upiPayments();
		
		
	}
	
	
	

}
