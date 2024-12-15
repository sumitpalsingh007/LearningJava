package helloworldconsulting;

public class StringExample {

    public static void main(String[] args){
        String name = new String("SPS");
        String fullName = "SPS Kohli";
        String officialName = "SPS Kohli";
        String designationName = officialName.concat(" Software Engineer");
        //String is an immutable class
        String str = "Hello, World!";

        // Concatenation
        String newStr = str + " How are you?";
        System.out.println(newStr); // Output: Hello, World! How are you?

        // Substring
        String subStr = str.substring(7, 12);
        System.out.println(subStr); // Output: World

        // Replacement
        String replacedStr = str.replace("World", "Java");
        System.out.println(replacedStr); // Output: Hello, Java!
    }
}
