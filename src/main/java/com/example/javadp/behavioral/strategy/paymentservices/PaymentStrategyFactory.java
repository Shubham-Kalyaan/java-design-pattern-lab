package com.example.javadp.behavioral.strategy.paymentservices;

import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;
import com.example.javadp.behavioral.strategy.paymentservices.impl.CreditCardStrategy;
import com.example.javadp.behavioral.strategy.paymentservices.impl.NetBankingStrategy;
import com.example.javadp.behavioral.strategy.paymentservices.impl.UpiStrategy;

public class PaymentStrategyFactory {
    public static IPaymentStrategy getStrategy(String type) {
        switch (type.toUpperCase()) {
            case "CARD":
                return new CreditCardStrategy();
            case "UPI":
                return new UpiStrategy();
            case "NET":
                return new NetBankingStrategy();
            default:
                throw new IllegalArgumentException("Invalid Payment Type");
        }
    }
}
