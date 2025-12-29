package com.example.javadp.structural.decorator.concrete;

import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;
import com.example.javadp.structural.decorator.PaymentDecorator;

public class LoggingPaymentDecorator extends PaymentDecorator {
    public LoggingPaymentDecorator(IPaymentStrategy strategy) {
        super(strategy);
    }

    @Override
    public String pay(double amount) {
        System.out.println("Logging: Payment of amount " + amount + " is being processed.");
        String result = super.pay(amount);
        System.out.println("Logging: Payment of amount " + amount + " has been processed.");
        return result;
    }
}
