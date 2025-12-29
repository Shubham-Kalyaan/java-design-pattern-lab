package com.example.javadp.structural.decorator;

import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;

public class PaymentDecorator implements IPaymentStrategy {
    private final IPaymentStrategy wrappedStrategy;

    public PaymentDecorator(IPaymentStrategy strategy) {
        this.wrappedStrategy = strategy;
    }

    @Override
    public String pay(double amount) {
        return wrappedStrategy.pay(amount);
    }
}
