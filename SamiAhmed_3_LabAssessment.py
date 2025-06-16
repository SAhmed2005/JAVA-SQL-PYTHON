serving_cost = 1.00
labor_rate = 7.50
shop_rental = 800
utilities = 150
advertising = 100
servings_per_month = 1000
selling_price = 4.00
expenses = serving_cost + labor_rate + shop_rental + utilities + advertising
income = selling_price + servings_per_month
profit_loss = 0
print("Expenses: ")
print("1. Cost per serving: 1.0")
print("2. Labor rate per hour: 7.5")
print("3. Shop rental per month: 800")
print("4. Utilities per month: 150")
print("5. Advertising budget per month: 100")
print(" ")
print("Income:")
print("6. Selling price (each): 4.0")
print("7. Servings sold per month: 500")
print(" ")
print("Analysis: ")
if expenses > income:
    profit_loss = expenses - income
    print("The current monthly loss is: ", profit_loss)
elif income > expenses:
    profit_loss = income - expenses
    print("The current monthly profit is: ", profit_loss)
selection = int(input("Enter Selection (1 - 7) or (0 to Exit): "))
while True:
    if selection == 0:
        break
    elif selection == 1:
        servings = float(input("Enter cost per serving: "))
        serving_cost = servings
        break
    elif selection == 2:
        labor = float(input("Enter the labor rate per hour: "))
        labor_rate = labor
        break
    elif selection == 3:
        shop = float(input("Enter shop rental per month: "))
        shop_rental = shop
        break
    elif selection == 4:
        utilities_monthly =float(input("Enter utilities per month: "))
        utilities = utilities_monthly
        break
    elif selection == 5:
        advertising_budget = float(input("Enter advertising budget per month: "))
        advertising = advertising_budget
        break
    elif selection == 6:
        selling = float(input("Enter selling price: "))
        selling_price = selling
        break
    elif selection == 7:
        servings_sold = float(input("Enter servings sold per month: "))
        servings_per_month = servings_sold
        break
expenses = serving_cost + labor_rate + shop_rental + utilities + advertising
income = selling_price + servings_per_month
if expenses > income:
    profit_loss = expenses - income
    print("Based on the current changes, the projected monthly loss is: ", profit_loss)
elif income > expenses:
    profit_loss = income - expenses
    print("Based on the current changes, the projected monthly profit is: ", profit_loss)
