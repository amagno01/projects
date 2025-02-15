import random

# Initialize the board
board = ["-" for _ in range(9)]
currentPlayer = "X"
winner = None
gameRunning = True

# Function to display the board
def printBoard(board):
    print("\n")
    print(board[0] + " | " + board[1] + " | " + board[2])
    print("---------")
    print(board[3] + " | " + board[4] + " | " + board[5])
    print("---------")
    print(board[6] + " | " + board[7] + " | " + board[8])
    print("\n")

# Function to handle player input with validation
def playerInput(board):
    while True:
        try:
            inp = int(input("Select a spot (1-9): ")) - 1
            if 0 <= inp <= 8 and board[inp] == "-":
                board[inp] = currentPlayer
                break
            else:
                print("Invalid move! Please choose an empty spot between 1-9.")
        except ValueError:
            print("Invalid input! Please enter a number between 1-9.")

# Function to check for a win
def checkWin(board):
    global winner, gameRunning

    # Winning combinations (rows, columns, diagonals)
    win_conditions = [
        (0, 1, 2), (3, 4, 5), (6, 7, 8),  # Horizontal
        (0, 3, 6), (1, 4, 7), (2, 5, 8),  # Vertical
        (0, 4, 8), (2, 4, 6)              # Diagonal
    ]

    for (x, y, z) in win_conditions:
        if board[x] == board[y] == board[z] and board[x] != "-":
            winner = board[x]
            gameRunning = False
            return True
    return False

# Function to check for a tie
def checkIfTie(board):
    global gameRunning
    if "-" not in board and not checkWin(board):
        printBoard(board)
        print("It's a tie!")
        gameRunning = False

# Function to switch players
def switchPlayer():
    global currentPlayer
    currentPlayer = "O" if currentPlayer == "X" else "X"

# Function for the computer to make a move
def computerMove(board):
    if currentPlayer == "O" and gameRunning:
        print("Computer's turn...")
        while True:
            position = random.randint(0, 8)
            if board[position] == "-":
                board[position] = "O"
                break

# Main game loop
while gameRunning:
    printBoard(board)
    
    if currentPlayer == "X":
        playerInput(board)
    else:
        computerMove(board)
    
    if checkWin(board):
        printBoard(board)
        print(f"The winner is {winner}!")
        break
    
    checkIfTie(board)
    switchPlayer()
