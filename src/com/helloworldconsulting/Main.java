package com.helloworldconsulting;

public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal();

        Animal myAnimal = new Animal() {
            void makeSound() {
                System.out.println("Roar");
            }
        };
        myAnimal.makeSound();
    }
}
