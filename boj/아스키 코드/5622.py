target = input()
total = 0
for i in target:
    base_sec = 2
    if (i == 'A' or i == 'B' or i == 'C'):
        base_sec += 1
    elif (i == 'D' or i == 'E' or i == 'F'):
        base_sec += 2
    elif (i == 'G' or i == 'H' or i == 'I'):
        base_sec += 3
    elif (i == 'J' or i == 'K' or i == 'L'):
        base_sec += 4
    elif (i == 'M' or i == 'N' or i == 'O'):
        base_sec += 5
    elif (i == 'P' or i == 'Q' or i == 'R' or i == 'S'):
        base_sec += 6
    elif (i == 'T' or i == 'U' or i == 'V'):
        base_sec += 7
    elif (i == 'W' or i == 'X' or i == 'Y' or i == 'Z'):
        base_sec += 8
    total += base_sec
print(total)
