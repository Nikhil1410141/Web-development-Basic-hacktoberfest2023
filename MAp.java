// Java program to Find Entry
// with the Highest Value in Map
// Using Comparators in Map interface

// Importing all utility classes
import java.util.*;

// Main class
class GFG {

	// Method 1
	// Find the entry with highest value
	public static <K, V extends Comparable<V> >
		Map.Entry<K, V>
		getMaxEntryInMapBasedOnValue(Map<K, V> map)
	{

		// To store the result
		Map.Entry<K, V> entryWithMaxValue = null;

		// Iterate in the map to find the required entry
		for (Map.Entry<K, V> currentEntry :
			map.entrySet()) {

			if (
				// If this is the first entry, set result as
				// this
				entryWithMaxValue == null

				// If this entry's value is more than the
				// max value Set this entry as the max
				|| currentEntry.getValue().compareTo(
					entryWithMaxValue.getValue())
					> 0) {

				entryWithMaxValue = currentEntry;
			}
		}

		// Return the entry with highest value
		return entryWithMaxValue;
	}

	// Method 2
	// To print the map
	public static void print(Map<String, Integer> map)
	{

		System.out.print("Map: ");

		// If map does not contain any value
		if (map.isEmpty()) {

			System.out.println("[]");
		}
		else {
			System.out.println(map);
		}
	}

	// Method 3
	// Main driver method
	public static void main(String[] args)
	{

		// Creating a Map
		// Declaring object of string and integer type
		Map<String, Integer> map = new HashMap<>();

		// Inserting elements in the Map object
		// using put() method
		// Custom input element addition
		map.put("ABC", 10);
		map.put("DEF", 30);
		map.put("XYZ", 20);

		// Calling method 2 to
		// print the map
		print(map);

		// Calling method 1 to
		// find the entry with highest value and
		// print on the console
		System.out.println(
			"Entry with highest value: "
			+ getMaxEntryInMapBasedOnValue(map));
	}
}
