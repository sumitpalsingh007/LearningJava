package com.helloworldconsulting.designPatterns.behavioural.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        cart.checkout(500);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(1000);

        // Pay using UPI
        cart.setPaymentStrategy(new UpiPayment("user@upi"));
        cart.checkout(200);
    }
}