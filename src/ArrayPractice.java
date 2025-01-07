public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] stringArray = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    stringArray[0] = "Primus";
    stringArray[1] = "Secundus";
    stringArray[2] = "Tertius";
    stringArray[3] = "Quartus";
    // Get the value of the array at index 2
    System.out.println("The Value of Index 2 is: " + stringArray[2]);
    // Get the length of the array
    System.out.println("The Length of the Array is: " + stringArray.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < stringArray.length; i++) {
      System.out.println(stringArray[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String string : stringArray) {
      System.out.println(string);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
