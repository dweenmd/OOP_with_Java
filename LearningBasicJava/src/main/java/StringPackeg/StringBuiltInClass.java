package StringPackeg;

public class StringBuiltInClass {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // Accessors
        char firstChar = str.charAt(0);
        System.out.println("First Character: " + firstChar);
        
        int length = str.length();
        System.out.println("Length: " + length);
        
        String substring1 = str.substring(7);
        System.out.println("Substring from index 7: " + substring1);
        
        String substring2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring2);

        // Searching and Comparing
        int indexOf = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOf);
        
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);
        
        boolean endsWith = str.endsWith("!");
        System.out.println("Ends with '!': " + endsWith);

        // Modifying
        String concatString = str.concat(" Welcome");
        System.out.println("Concatenated String: " + concatString);
        
        String replacedString = str.replace("World", "Universe");
        System.out.println("Replaced String: " + replacedString);
        
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
        
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        
        String trimmedString = "   Trim me   ".trim();
        System.out.println("Trimmed String: " + trimmedString);

        // Splitting and Joining
        String[] splitString = str.split(", ");
        System.out.println("Split String: " + java.util.Arrays.toString(splitString));
        
        String joinedString = String.join(" - ", "Java", "is", "fun");
        System.out.println("Joined String: " + joinedString);

        // Conversion
        String valueOfInt = String.valueOf(123);
        System.out.println("Value of int: " + valueOfInt);
        
        String valueOfBoolean = String.valueOf(true);
        System.out.println("Value of boolean: " + valueOfBoolean);

        // Other
        int compareTo = str.compareTo("Hello");
        System.out.println("Compare To 'Hello': " + compareTo);
        
        boolean equals = str.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!': " + equals);
        
        boolean isEmpty = str.isEmpty();
        System.out.println("Is Empty: " + isEmpty);
        
        String internedString = str.intern();
        System.out.println("Interned String: " + internedString);
    }
}
