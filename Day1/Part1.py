with open("/Users/nurdanemin/Desktop/AOC-2021-day1.txt") as file:
    first_line = file.readline().strip().split(" ")[0]
    second_line = file.readline().strip().split(" ")[0]
    number_of_increments = 0
    while second_line:
        if int(second_line) > int(first_line):
            number_of_increments += 1

        first_line = second_line
        second_line = file.readline().strip().split(" ")[0]

print(number_of_increments)
