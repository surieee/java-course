package section11;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	BigDecimal principal, interest;

	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValues(int years) {
		BigDecimal yearsBD = new BigDecimal(years);
		BigDecimal total = principal.add(principal.multiply(interest).multiply(yearsBD));
		return total;
	}

}