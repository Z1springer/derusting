import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> stringMap = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    stringMap.put("Primus", 1);
    stringMap.put("Secundus", 2);
    stringMap.put("Tertius", 3);
    // Get the value associated with a given key in the Map
    int value = stringMap.get("Secundus");
    System.out.println("The value pair of the key Secundus is: " + value);
    // Find the size (number of key/value pairs) of the Map
    System.out.println("The Size of the Map is: " + stringMap.size());
    // Replace the value associated with a given key (the size of the Map shoukld
    // not change)
    System.out.println("Before: " + stringMap);
    System.out.println(stringMap.replace("Primus", 1, 1000));
    System.out.println("After: " + stringMap);
    // Check whether the Map contains a given key
    System.out.println(stringMap.containsKey("Tertius"));
    // Check whether the Map contains a given value
    System.out.println(stringMap.containsValue(1000));
    // Iterate over the keys of the Map, printing each key
    System.out.println("The Keys of the Map are: " + stringMap.keySet());
    // Iterate over the values of the map, printing each value
    System.out.println("The Values within the Map are: " + stringMap.values());
    // Iterate over the entries in the map, printing each key and value
    System.out.println("The Key-Value Pairs are: " + stringMap.entrySet());
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone
     * number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the
     * keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
