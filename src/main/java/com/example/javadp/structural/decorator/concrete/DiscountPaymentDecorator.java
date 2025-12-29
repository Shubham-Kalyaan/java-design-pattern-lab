package com.example.javadp.structural.decorator.concrete;

import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;
import com.example.javadp.structural.decorator.PaymentDecorator;

public class DiscountPaymentDecorator extends PaymentDecorator {
    private final double discountPercentage;

    public DiscountPaymentDecorator(IPaymentStrategy strategy, double discountPercentage) {
        super(strategy);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String pay(double amount) {
        double discountedAmount = amount - (amount * discountPercentage / 100);
        System.out.println("Applying discount: Original amount: " + amount + ", Discounted amount: " + discountedAmount);
        return super.pay(discountedAmount);
    }
}
