package com.helloworldconsulting.designPatterns.behavioural.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsChannel channel = new NewsChannel();

        Observer alice = new Subscriber("Alice");
        Observer bob = new Subscriber("Bob");

        channel.attach(alice);
        channel.attach(bob);

        channel.notifyAllObservers("Breaking News: Observer Pattern in Java!");

        channel.detach(alice);

        channel.notifyAllObservers("New Update: Java 21 Released!");
    }
}