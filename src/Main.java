import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Display Header
        System.out.println("==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================\n");

        // 2. CREATE: Initialize the ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // 3. ADD: Adding new bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // 4. DELETE: Remove 'AC Chair'
        passengerBogies.remove("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);
        System.out.println();

        // 5. READ: Check if 'Sleeper' exists using contains()
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper);
        System.out.println();

        // 6. Display Final State
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);
        System.out.println("\nUC2 operations completed successfully...");
    }
}