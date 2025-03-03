# Prompt the user to enter five numbers
numbers = []  # Create an empty list to store numbers

for i in range(1, 6):  # Loop 5 times to get 5 numbers
    num = float(input(f"Enter number {i}: "))  # Convert input to float for decimal handling
    numbers.append(num)  # Add number to the list

# Determine the minimum and maximum values
min_number = min(numbers)
max_number = max(numbers)

# Display the results
print("\nThe minimum number is:", min_number)
print("The maximum number is:", max_number)
