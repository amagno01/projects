import java.util.Random;


public class RandomArrayCalculator {
    public static void main(String[] args) {
        // Generate an array of 15 random integers
        int[] randomArray = generateRandomArray(15);


        // Calculate the sum of the array elements
        int sum = calculateSum(randomArray);


        // Print the original array
        System.out.println("Random Array: " + java.util.Arrays.toString(randomArray));


        // Print the sum of the array elements
        System.out.println("Sum of the array elements: " + sum);
    }


    // Method to generate an array of random integers
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random rand = new Random();


        // Fill the array with random integers
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100); // Adjust the upper limit as needed, this means up to 0-100
        }


        return array;
    }


    // Method to calculate the sum of an array
    private static int calculateSum(int[] array) {
        int sum = 0;


        // Iterate through the array and add each element to the sum
        for (int value : array) {
            sum += value;
        }


        // Return the calculated sum
        return sum;
    }
}
