package com.helloworldconsulting.designPatterns.behavioural.strategy;

class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute payment using the selected strategy
    public void checkout(int amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set");
        }
        paymentStrategy.pay(amount);
    }
}