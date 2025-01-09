import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String string1 = "Primus";
    // Find the length of the string
    System.out.println(string1.length());
    // Concatenate (add) two strings together and reassign the result
    String string2 = "Secundus";

    String concatenatedString = string1 + string2;
    System.out.println(concatenatedString);
    // Find the value of the character at index 3
    System.out.println(concatenatedString.charAt(3));
    // Check whether the string contains a given substring (i.e. does the string
    // have "abc" in it?)
    if (concatenatedString.contains("abc")) {
      System.out.println("This String contains abc");
    } else {
      System.out.println("This String does not contain abc");
    }
    // Iterate over the characters of the string, printing each one on a separate
    // line
    char[] charArray = concatenatedString.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      System.out.println(charArray[i]);
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringList = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Tertius");
    stringList.add("Quartus");
    stringList.add("Quintus");
    // Join all of the strings in the list together into a single string separated
    // by commas
    // Use a built-in method to achieve this instead of using a loop
    String.join(", ", stringList);
    System.out.println(stringList);
    // Check whether two strings are equal
    System.out.println(string1.equals(string2));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
