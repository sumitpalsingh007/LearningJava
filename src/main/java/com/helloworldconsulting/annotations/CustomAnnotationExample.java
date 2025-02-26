package com.helloworldconsulting.annotations;

public class CustomAnnotationExample {
    @MyAnnotation
    public void display() {
        System.out.println("Custom Annotation Example");
    }

    public static void main(String[] args) throws Exception {
        CustomAnnotationExample example = new CustomAnnotationExample();
        example.display();

        // Accessing the annotation at runtime
        MyAnnotation annotation = example.getClass()
            .getMethod("display")
            .getAnnotation(MyAnnotation.class);

        System.out.println("Annotation Value: " + annotation.value());
    }
}
