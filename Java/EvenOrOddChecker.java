import java.util.*; // import proper Java class


public class EvenOrOddChecker { // create and acknowledge controlling class
    public static void main(String[] args) { // create and acknowledge the main method
        Scanner input = new Scanner(System.in); // import the scanner class


        try { // begin try statement to secure code
            System.out.println("How many numbers would you like to enter?"); // prompts user how many numbers they'd like to check if its even or odd
            int numbers = input.nextInt(); // reads in data

            // start a for loop to input and process each number
            for (int i = 1; i <= numbers; i++) {


                // prompts user to enter any number
                System.out.println("\nPlease enter a number to determine if its even or odd!");
                int number = input.nextInt(); // reads in data


                if (number % 2 == 0) { // acknowledges math operation, checking if the number entered is even or odd and display the result
                    System.out.println("The number " + number + " is even!");
                } else {
                    System.out.println("The number " + number + " is odd!");
                }
            } // ends for loop

        } catch (InputMismatchException errorMessage) { // handles mismatch exception if user decides to enter a non-integer value
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally { // closes the scanner class to prevent leaks / errors
            input.close();
        }
    }
}
