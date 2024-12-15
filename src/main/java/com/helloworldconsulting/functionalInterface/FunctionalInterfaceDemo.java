package helloworldconsulting.functionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        StringProcessor toUpperCaseProcessor = (input) -> input.toUpperCase();
        String result = toUpperCaseProcessor.process("hello world");
        System.out.println(result);

        StringProcessor reverseProcessor = input -> new StringBuilder(input)
                .reverse().toString();
        String reversedResult = reverseProcessor.process("hello world");
        System.out.println(reversedResult);
    }
}
