package week4.day1;

public abstract class CanaraBank implements Payments{

	
	public void recordPaymentDetails(String paymentType) {
		
		System.out.println("Recording payment details for "+paymentType);
		
	}
}
