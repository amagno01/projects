def compute_factorial(n):
    """Computes the factorial of a given number using an iterative approach."""
    factorial = 1
    steps = []  # List to store the step-by-step calculation

    for i in range(1, n + 1):
        factorial *= i
        steps.append(str(i))  # Store the current number being multiplied

    return factorial, steps  # Return both result and calculation steps


def main():
    """Main function to get user input and compute factorial with a loop to continue."""
    while True:
        while True:  # Loop until valid input is provided
            try:
                num = int(input("\nEnter a non-negative integer (or type 'exit' to quit): "))
                if num < 0:
                    print("Error: Factorial is not defined for negative numbers.")
                else:
                    result, steps = compute_factorial(num)  # Compute factorial and get steps
                    calculation_process = " * ".join(steps)  # Format the multiplication steps

                    print(f"\nFactorial Calculation for {num}:")
                    print(f"{num}! = {calculation_process} = {result}")  # Show step-by-step calculation
                    print(f"\nThe factorial of {num} is {result}\n")  # Final statement
                    break  # Exit inner loop after successful calculation
            except ValueError:
                print("Error: Please enter a valid non-negative integer.")

        # Ask user if they want to continue
        again = input("\nDo you want to compute another factorial? (yes/no): ").strip().lower()
        if again not in ['yes', 'y']:
            print("Goodbye! Exiting program.")
            break  # Exit main loop if user doesn't want to continue


if __name__ == "__main__":
    main()
