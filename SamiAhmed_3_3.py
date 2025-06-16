name = input("Enter your name: ")
password = "Pas$Word"
input_password = input("Enter your password: ")
while input_password != password:
    print("Incorrect password, try again...")
    input_password = input("Enter your password: ")
else:
    print("Welcome back, ", name)