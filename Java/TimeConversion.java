import java.util.Scanner; // Import the Scanner class

public class TimeConversion { // Controlling class
    public static void main(String[] args) { // Main method
        Scanner input = new Scanner(System.in); // Create a single Scanner instance

        while (true) { // Loop to allow multiple conversions until user exits
            // Display the menu
            System.out.println("\nSelect a time conversion operation:");
            System.out.println("1. Hours to Minutes");
            System.out.println("2. Days to Hours");
            System.out.println("3. Minutes to Hours");
            System.out.println("4. Hours to Days");
            System.out.println("5. Exit");

            // Prompt the user to select an option
            System.out.print("Enter the number of your choice: ");
            int choice = input.nextInt(); // Read user input

            // Perform the selected conversion
            switch (choice) {
                case 1:
                    hoursToMinutes(input);
                    break;
                case 2:
                    daysToHours(input);
                    break;
                case 3:
                    minutesToHours(input);
                    break;
                case 4:
                    hoursToDays(input);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    input.close(); // Close the scanner
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please select a valid option (1-5).");
            }
        }
    }

    // Method to convert hours to minutes
    public static void hoursToMinutes(Scanner input) {
        System.out.print("Enter the number of hours: ");
        int hours = input.nextInt();
        int minutes = hours * 60;
        System.out.println(hours + " hours is equal to " + minutes + " minutes.");
    }

    // Method to convert days to hours
    public static void daysToHours(Scanner input) {
        System.out.print("Enter the number of days: ");
        int days = input.nextInt();
        int hours = days * 24;
        System.out.println(days + " days is equal to " + hours + " hours.");
    }

    // Method to convert minutes to hours
    public static void minutesToHours(Scanner input) {
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        double hours = minutes / 60.0;
        System.out.printf("%d minutes is equal to %.2f hours.%n", minutes, hours);
    }

    // Method to convert hours to days
    public static void hoursToDays(Scanner input) {
        System.out.print("Enter the number of hours: ");
        int hours = input.nextInt();
        double days = hours / 24.0;
        System.out.printf("%d hours is equal to %.2f days.%n", hours, days);
    }
}
