package grouping;

import org.testng.annotations.Test;

public class PaymentTest {
	@Test(priority = 1, groups = { "regression", "sanity", "functional" })
	void Paymentinrupees() {
		System.out.println("Payment in rupees");

	}

	@Test(priority = 2, groups = { "regression", "sanity", "functional" })
	void Paymentindollars() {
		System.out.println("Payment in dollars");

	}
}
