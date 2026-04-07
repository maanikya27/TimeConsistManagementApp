// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String type;   // e.g., Rectangular, Cylindrical
    private String cargo;  // Assigned cargo

    public GoodsBogie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // Method to assign cargo with safety validation
    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe assignment: Petroleum cannot be carried in Rectangular bogies!");
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + type + " → " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for bogie type: " + type);
        }
    }

    @Override
    public String toString() {
        return type + " → " + (cargo == null ? "No cargo assigned" : cargo);
    }
}

// Main Application
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");

        // Safe assignment
        cylindrical.assignCargo("Petroleum");

        // Unsafe assignment
        rectangular.assignCargo("Petroleum");

        // Another safe assignment
        rectangular.assignCargo("Coal");

        // Display final bogie states
        System.out.println("Final Bogie States:");
        System.out.println(rectangular);
        System.out.println(cylindrical);
    }
}