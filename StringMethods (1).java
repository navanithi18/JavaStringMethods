import java.util.*;


class StringMethods{
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "WORD";

        // CONCATENATION
        System.out.println("AFTER CONCATENATION: " + str1 + " " + str2);

        // LENGTH function : .length
        int length = str1.length();
        System.out.println("Length: " + length);

        // CHARACTER at a specific index
        char ch = str1.charAt(3);
        System.out.println("Character at index 3: " + ch);

        // EQUAL comparison
        System.out.println("IS EQUAL: " + str1.equals(str2));

        // IGNORE case comparison
        System.out.println("IS EQUAL (IGNORE CASE): " + str1.equalsIgnoreCase(str2));

        // UPPER CASE and LOWER CASE conversion
        System.out.println("UPPERCASE: " + str1.toUpperCase());
        System.out.println("LOWERCASE: " + str2.toLowerCase());

        // INDEXOF
        System.out.println("INDEX OF 'R' in str2: " + str2.indexOf('R'));

        // lastIndexOf
        System.out.println("LAST INDEX OF 'e' in str1: " + str1.lastIndexOf('e'));

        // startsWith
        System.out.println("STARTS WITH : " + str1.startsWith("hello"));
        
        // endsWith
        System.out.println("ENDS WITH : " + str2.endsWith("WORD"));

        // SPLIT (only showing the first split)
        String str3 = "apple,banana,orange";
        String[] fruits = str3.split(",", 2);  // Limit split to first 2 parts
        System.out.println("SPLIT: " + fruits[0] + " and " + fruits[1]);

        // TRIM
        String str4 = "   Hello World!   ";
        System.out.println("TRIM: '" + str4.trim() + "'");

        // VALUE OF (to convert a primitive value to a string)
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("VALUE OF: " + numStr);
        // REPLACE (replaces first occurrence)
        String str6 = "Hello, World!";
        System.out.println("REPLACE: " + str6.replace('o', '0'));

        // REPLACEALL (replaces all occurrences)
        System.out.println("REPLACEALL: " + str6.replaceAll("o", "0"));

        // REPLACEFIRST (replaces the first occurrence of a substring)
        System.out.println("REPLACEFIRST: " + str6.replaceFirst("o", "0"));

        // ISEMPTY (checks if the string is empty)
        String str7 = "";
        System.out.println("ISEMPTY: " + str7.isEmpty());

        // TOCHARARRAY (converts a string to a string of characters)
        StringBuilder charString = new StringBuilder();
        for (char c : str1.toCharArray()) {
            charString.append(c).append(" ");
        }
        System.out.println("TOCHARARRAY: " + charString.toString().trim());

        // EQUALS (checks if two strings are equal)
        System.out.println("EQUALS: " + str1.equals(str2));

        // EQUALSIGNORECASE (checks if two strings are equal, ignoring case)
        System.out.println("EQUALSIGNORECASE: " + str1.equalsIgnoreCase("HELLO"));

        // CONCAT (concatenates two strings)
        System.out.println("CONCAT: " + str1.concat(" ").concat(str2));
    }
}
