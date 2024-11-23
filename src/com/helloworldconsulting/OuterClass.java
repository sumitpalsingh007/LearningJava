package com.helloworldconsulting;

public class OuterClass {
    private static String message = "Hello from Outer Class!";

    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }

    static class StaticNestedClass {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();

        OuterClass outer1 = new OuterClass();
        outer1.display();
    }

    void display() {
        class LocalInnerClass {
            void message() {
                System.out.println("Hello from Local Inner Class!");
            }
        }
        LocalInnerClass local = new LocalInnerClass();
        local.message();
    }
}

