// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " → " + capacity + " seats";
    }
}

// Main Application
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        try {
            PassengerBogie sleeper = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + sleeper);

            PassengerBogie acChair = new PassengerBogie("AC Chair", 56);
            System.out.println("Created: " + acChair);

            // Invalid case: zero capacity
            PassengerBogie invalid = new PassengerBogie("First Class", 0);
            System.out.println("Created: " + invalid);

        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }

        try {
            // Invalid case: negative capacity
            PassengerBogie invalid2 = new PassengerBogie("Luxury", -10);
            System.out.println("Created: " + invalid2);
        } catch (InvalidCapacityException e) {
            System.out.println("Error creating bogie: " + e.getMessage());
        }
    }
}