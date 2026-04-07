import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    private String type;   // e.g., Rectangular, Cylindrical
    private String cargo;  // e.g., Coal, Petroleum

    // Constructor
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " → " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Prepare a list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // Invalid case

        // Safety compliance check using Streams
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // Non-cylindrical bogies can carry any cargo
                });

        // Display result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT.");
        } else {
            System.out.println("Train is NOT SAFETY COMPLIANT!");
        }

        // Display bogie list for clarity
        System.out.println("Goods bogies in train: " + goodsBogies);
    }
}