def classify_wind_speed(wind_speed):
    """Classifies the wind speed based on the Saffir-Simpson Hurricane Scale."""
    if wind_speed < 0:
        return "Error: Wind speed cannot be negative. Please enter a valid non-negative number."
    elif wind_speed < 39:
        return "Not a tropical storm or hurricane."
    elif 39 <= wind_speed <= 73:
        return "Tropical Storm: Wind speeds range from 39 – 73 mph."
    elif 74 <= wind_speed <= 95:
        return "Category 1 Hurricane: Very dangerous winds will produce some damage."
    elif 96 <= wind_speed <= 110:
        return "Category 2 Hurricane: Extremely dangerous winds will cause extensive damage."
    elif 111 <= wind_speed <= 129:
        return "Category 3 Hurricane: Devastating damage will occur."
    elif 130 <= wind_speed <= 156:
        return "Category 4 Hurricane: Catastrophic damage will occur."
    else:  # wind_speed >= 157
        return "Category 5 Hurricane: Catastrophic damage; high devastation."

def main():
    """Main function for continuous wind speed input with an exit option."""
    while True:
        user_input = input("Enter wind speed in mph (or type 'exit' to quit): ").strip().lower()

        if user_input == "exit":
            print("Program terminated. Thank you!")
            break  # Exit the loop if the user enters 'exit'

        try:
            wind_speed = int(user_input)  # Convert input to an integer
            classification = classify_wind_speed(wind_speed)
            print(f"\nWind Speed Classification:\n{classification}\n")
        except ValueError:
            print("Error: Please enter a valid integer for wind speed or type 'exit' to quit.")

if __name__ == "__main__":
    main()
