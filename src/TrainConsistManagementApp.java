import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (you can replace these with user input from Scanner)
        String trainId1 = "TRN-1234";
        String trainId2 = "TRAIN12";
        String cargoCode1 = "PET-AB";
        String cargoCode2 = "PET-ab";

        // Define regex patterns
        String trainIdPattern = "TRN-\\d{4}";      // TRN- followed by exactly 4 digits
        String cargoCodePattern = "PET-[A-Z]{2}";  // PET- followed by exactly 2 uppercase letters

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Validate Train IDs
        validateInput(trainPattern, trainId1, "Train ID");
        validateInput(trainPattern, trainId2, "Train ID");

        // Validate Cargo Codes
        validateInput(cargoPattern, cargoCode1, "Cargo Code");
        validateInput(cargoPattern, cargoCode2, "Cargo Code");
    }

    // Utility method for validation
    private static void validateInput(Pattern pattern, String input, String label) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(label + " \"" + input + "\" is VALID.");
        } else {
            System.out.println(label + " \"" + input + "\" is INVALID.");
        }
    }
}