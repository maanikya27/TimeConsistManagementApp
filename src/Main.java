import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // 1. Display Header
        System.out.println("==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================\n");

        // 2. Create a Set to store unique bogie IDs
        // HashSet does not allow duplicate values
        Set<String> bogies = new HashSet<>();

        // 3. ADD IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Attempting to add duplicate entries
        // These will be internally ignored by the HashSet
        bogies.add("BG101");
        bogies.add("BG102");

        // 4. Display the unique bogie identifiers
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // 5. Conclusion
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("\nUC3 uniqueness validation completed...");
    }
}