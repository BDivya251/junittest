package com.app.testing;


import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class OrderServiceTest {
	@Test
	void testOrderSuccess() {
		PaymentService payment = mock(PaymentService.class);
		StockRepository stock = mock(StockRepository.class);
		// ✅ Define behavior of mocks
        when(stock.checkStock("ITEM123")).thenReturn(true);
        when(payment.doPayment(500.0)).thenReturn(true);
        
        OrderService orderser = new OrderService(payment,stock);
        String a = orderser.placeOrder("ITEM123", 500.0);
        assertEquals("ORDER SUCCESS",a);
        verify(stock).checkStock("ITEM123");
        verify(payment).doPayment(500.0);
	}

}
