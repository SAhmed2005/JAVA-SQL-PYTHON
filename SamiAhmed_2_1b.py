days_driven = int(input("Days you have been driving: "))
years = days_driven//365
weeks =(days_driven - (years* 365))//7
days = days_driven - ((years * 365) + (weeks * 7))
print("You have been driving for: ")
print("Years: ", years)
print("Weeks: ", weeks)
print("Days :", days)