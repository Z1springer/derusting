import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> stringSet = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    stringSet.add("Primus");
    stringSet.add("Secundus");
    stringSet.add("Tertius");
    // Check whether the Set contains a given String
    System.out.println(stringSet.contains("Quartus"));
    // Remove an element from the Set
    System.out.println(stringSet);
    stringSet.remove("Secundus");
    System.out.println(stringSet);
    // Get the size of the Set
    System.out.println(stringSet.size());
    // Iterate over the elements of the Set, printing each one on a separate line
    for (String str : stringSet) {
      System.out.println(str);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different
     * results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a
     * specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
