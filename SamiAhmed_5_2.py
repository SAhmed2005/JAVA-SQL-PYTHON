berries = ["Strawberry", "Blueberry", "Blackberry", "Cranberry"]
berries.append("Raspberry")
fruits = []
fruits.extend(berries)
fruits.insert(2, "Mangoes")
fruits.pop(1)
fruits.insert(1, "Apples")
fruits.sort(key=None, reverse=False)
print(fruits)