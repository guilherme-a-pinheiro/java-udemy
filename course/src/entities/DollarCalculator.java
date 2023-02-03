package entities;

public class DollarCalculator {
	public static double totalPrice(double price, double dollarsQuantity) {
		final double IOF = 0.06;
		double plusIOF = price * dollarsQuantity * IOF;
		return price * dollarsQuantity + plusIOF;
	}
}
