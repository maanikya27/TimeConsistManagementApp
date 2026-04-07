import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // 1. Display Header
        System.out.println("==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================\n");

        // 2. Create a LinkedList
        // We use LinkedList here for positional operations
        LinkedList<String> trainConsist = new LinkedList<>();

        // 3. Initial Train Consist
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);
        System.out.println();

        // 4. Insert at a specific position (Position 2)
        // Java uses 0-based indexing (0=Engine, 1=Sleeper, 2=AC)
        // Inserting at index 2 pushes 'AC' to index 3
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);
        System.out.println();

        // 5. Remove First and Last Bogie
        trainConsist.removeFirst(); // Removes 'Engine'
        trainConsist.removeLast();  // Removes 'Guard'

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}