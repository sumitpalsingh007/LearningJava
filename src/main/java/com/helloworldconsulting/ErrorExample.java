package helloworldconsulting;

import java.util.ArrayList;
import java.util.List;

public class ErrorExample {
    public static void main(String[] args) {
            //recursiveMethod();
        List<int[]> list = new ArrayList<>();
        while (true) {
            list.add(new int[1000000]);
        }
    }

    static void recursiveMethod() {
        recursiveMethod(); // This will cause StackOverflowError
    }
}
