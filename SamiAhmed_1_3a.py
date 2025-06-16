# variables
distance_in_miles = 60
time_in_hours = 3

# calculation
distance_in_knots = distance_in_miles/1.15078
distance_in_feet = distance_in_miles * 5280
time_in_seconds = time_in_hours * 3600

# speed calculation
speed_in_knots = distance_in_knots/time_in_hours
speed_in_mph = distance_in_miles/time_in_hours
speed_in_ftps = distance_in_feet/time_in_seconds

# print
print("The speed in knots is: ", speed_in_knots)
print("The speed in miles per hour is: ", speed_in_mph)
print("The speed in feet per second is: ", speed_in_ftps)