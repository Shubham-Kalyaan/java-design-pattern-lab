package com.example.javadp.behavioral.strategy.paymentservices.impl;

import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;

public class CreditCardStrategy implements IPaymentStrategy {
    @Override
    public String pay(double amount) {
        return "Paid "+amount+"using Credit Card";
    }
}
