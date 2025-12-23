package com.example.javadp.behavioral.strategy.paymentservices.controller;

import com.example.javadp.behavioral.strategy.paymentservices.PaymentContext;
import com.example.javadp.behavioral.strategy.paymentservices.PaymentStrategyFactory;
import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/strategy")
public class PaymentController {
    @GetMapping("/pay")
    public String pay(@RequestParam String type, @RequestParam double amount) {
        IPaymentStrategy paymentStrategy = PaymentStrategyFactory.getStrategy(type);
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(paymentStrategy);
        return context.execute(amount);
    }
}
