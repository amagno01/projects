import java.util.Scanner; // import java class


public class MetricConverter { // controlling class
    public static void main(String[] args) { // main method
        Scanner input = new Scanner(System.in); // import scanner class


        // Display the menu for the user to select what conversion operation they would like to use
        System.out.println("Select a metric conversion operation:");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Feet to Centimeters");
        System.out.println("3. Yards to Meters");
        System.out.println("4. Miles to Kilometers");
        System.out.println("5. Centimeters to Inches");
        System.out.println("6. Centimeters to Feet");
        System.out.println("7. Meters to Yards");
        System.out.println("8. Kilometers to Miles");


        // Prompt the user to select an operation
        System.out.print("\nEnter the number of your choice: ");
        int choice = input.nextInt();


        // Perform the selected metric conversion
        switch (choice) {
            case 1:
                inchesToCentimeters();
                break;
            case 2:
                feetToCentimeters();
                break;
            case 3:
                yardsToMeters();
                break;
            case 4:
                milesToKilometers();
                break;
            case 5:
                centimetersToInches();
                break;
            case 6:
                centimetersToFeet();
                break;
            case 7:
                metersToYards();
                break;
            case 8:
                kilometersToMiles();
                break;
            default:
                System.out.println("\nInvalid choice. Please select a valid option (1-8).");
        }

        input.close(); // closes scanner class to prevent leaks/errors
    }


    // Method to convert inches to centimeters
    public static void inchesToCentimeters() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of inches: ");
        double inches = input.nextDouble();
        double centimeters = inches * 2.54;
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
        input.close();
    }


    // Method to convert feet to centimeters
    public static void feetToCentimeters() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        double feet = input.nextDouble();
        double centimeters = feet * 30.48;
        System.out.println(feet + " feet is equal to " + centimeters + " centimeters.");
        input.close();
    }


    // Method to convert yards to meters
    public static void yardsToMeters() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of yards: ");
        double yards = input.nextDouble();
        double meters = yards * 0.9144;
        System.out.println(yards + " yards is equal to " + meters + " meters.");
        input.close();
    }


    // Method to convert miles to kilometers
    public static void milesToKilometers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        double miles = input.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        input.close();
    }


    // Method to convert centimeters to inches
    public static void centimetersToInches() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of centimeters: ");
        double centimeters = input.nextDouble();
        double inches = centimeters / 2.54;
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches.");
        input.close();
    }


    // Method to convert centimeters to feet
    public static void centimetersToFeet() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of centimeters: ");
        double centimeters = input.nextDouble();
        double feet = centimeters / 30.48;
        System.out.println(centimeters + " centimeters is equal to " + feet + " feet.");
        input.close();
    }


    // Method to convert meters to yards
    public static void metersToYards() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of meters: ");
        double meters = input.nextDouble();
        double yards = meters / 0.9144;
        System.out.println(meters + " meters is equal to " + yards + " yards.");
        input.close();
    }


    // Method to convert kilometers to miles
    public static void kilometersToMiles() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of kilometers: ");
        double kilometers = input.nextDouble();
        double miles = kilometers / 1.60934;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        input.close();
    }
}
