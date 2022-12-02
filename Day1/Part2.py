with open("/Users/nurdanemin/Desktop/AOC-2021-day1.txt") as file:
    file = file.readlines()
    number_of_increments = 0
    for i in range(0, len(file) - 3):
        if int(file[i+3]) > int(file[i]):
            number_of_increments += 1
print(number_of_increments)
