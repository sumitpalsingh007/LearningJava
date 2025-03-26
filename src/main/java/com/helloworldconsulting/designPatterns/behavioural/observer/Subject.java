package com.helloworldconsulting.designPatterns.behavioural.observer;

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObservers(String message);
}