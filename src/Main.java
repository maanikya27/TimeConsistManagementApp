import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Display welcome banner
        System.out.println("==========================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("==========================================\n");

        // 2. Create a dynamic List to store train bogies
        // Using List (Interface) and ArrayList (Implementation)
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial consist information
        System.out.println("Train initialized successfully...");

        // 4. Display initial bogie count and the current list
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}