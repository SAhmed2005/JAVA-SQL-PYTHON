cars = ('coupe', 'coupe', 'coupe', 'carbiolet', 'sedan')
fav = cars.count("coupe")
amt = len(cars)
percentage = fav/amt
if percentage > 0.45:
    print("Too many coupes in the garage.")
else:
    print("You are all set with cars.")