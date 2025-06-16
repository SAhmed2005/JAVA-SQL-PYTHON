def convert_kg(value):
    ounces = value * 35.274
    pounds = value * 2.20462
    print("10 kgs is ", ounces, "ounces")
    print("10 kgs is ", pounds, "pounds")

def convert_pounds(value):
    kg = value * 0.453592
    ounces = value * 16
    print("10 pounds is ", kg, "kg")
    print("10 pounds is ", ounces, "ounces")


def convert_ounces(value):
    kg = value * 0.0283
    pounds = value * 0.0625
    print("10 ounces is ", kg, "kg")
    print("10 ounces is ", pounds, "pounds")


if __name__ == "__main__":
    convert_kg(10)
    convert_pounds(10)
    convert_ounces(10)
