package com.example.javadp.structural.decorator;

import com.example.javadp.behavioral.strategy.paymentservices.PaymentContext;
import com.example.javadp.behavioral.strategy.paymentservices.PaymentStrategyFactory;
import com.example.javadp.behavioral.strategy.paymentservices.contract.IPaymentStrategy;
import com.example.javadp.structural.decorator.concrete.DiscountPaymentDecorator;
import com.example.javadp.structural.decorator.concrete.LoggingPaymentDecorator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentDecorController {

    @PostMapping("/process")
    public String processPayment(@RequestParam String type,
                                 @RequestParam double amount,
                                 @RequestParam(required = false) Double discount) {
        //Get the base payment strategy
        IPaymentStrategy baseStrategy = PaymentStrategyFactory.getStrategy(type);

        //Decorate with logging
        IPaymentStrategy decoratedStrategy = new LoggingPaymentDecorator(baseStrategy);

        //Optionally decorate with discount
        if (discount != null && discount > 0) {
            decoratedStrategy = new DiscountPaymentDecorator(decoratedStrategy, discount);
        }

        // Use the decorated strategy in the payment context
        PaymentContext context = new PaymentContext();
        context.setPaymentStrategy(decoratedStrategy);
        return context.execute(amount);

    }
}
