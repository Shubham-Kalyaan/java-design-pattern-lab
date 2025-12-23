package com.example.javadp.behavioral.strategy.paymentservices;

import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;

public class PaymentContext {
    private IPaymentStrategy paymentStrategy;

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String execute(double amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Payment Strategy Not Selected.");
        }
        return this.paymentStrategy.pay(amount);
    }
}
