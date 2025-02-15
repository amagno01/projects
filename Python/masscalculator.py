def mass_calculator():
    mass = int(input("Enter the object's mass: "))
    weight = mass * 9.8


    print("Your object weighs {} Newtons.".format(weight))
    if(weight<100):
        print("Your object weighs less than 100 Newtons and is too light.")
    if(weight>500):
        print("Your object weighs more than 500 Newtons and is too heavy.")


if __name__ == "__main__": 
    mass_calculator()