package com.app.testing;

public class OrderService {
	private PaymentService paymentser;
	private StockRepository stockrepo;
	public OrderService(PaymentService paymentser,StockRepository stockrepo) {
		this.paymentser=paymentser;
		this.stockrepo=stockrepo;
	}
	public String placeOrder(String itemId, double amount) {

        boolean stock = stockrepo.checkStock(itemId);
        boolean paid = paymentser.doPayment(amount);

        if (stock && paid) {
            return "ORDER SUCCESS";
        }
        return "ORDER FAILED";
        
}
}
