drum = ["######",">#*###","####*#","#<#>>#",">#*#*<","######"]

n = len(drum)
count = 0
for k in range(n):
    x, y = 1, 1
    row, col = 0, k
    star_meet = 0
    while x != n:
        if (drum[row][col] == "#"):
            x += 1
            row += 1
        elif (drum[row][col] == ">"):
            y += 1
            col += 1
        elif (drum[row][col] == "<"):
            y -= 1
            col -= 1
        elif (drum[row][col] == "*"):
            if (star_meet == 0):
                star_meet += 1
                x += 1
                row += 1
            else:
                break
    if (x == n and (drum[x - 1][y - 1] != '*')):
        count += 1
print(count)


def solution(drum):
    n = len(drum)
    count = 0
    for k in range(n):
        x, y = 1, 1
        row, col = 0, k
        star_meet = 0
        while x != n:
            if (drum[row][col] == "#"):
                x += 1
                row += 1
            elif (drum[row][col] == ">"):
                y += 1
                col += 1
            elif (drum[row][col] == "<"):
                y -= 1
                col -= 1
            elif (drum[row][col] == "*"):
                if (star_meet == 0):
                    star_meet += 1
                    x += 1
                    row += 1
                else:
                    break
        if (x == n):
            if (drum[row][col] == "#" or (star_meet == 0 and drum[row][col] == "*")):
                count += 1
    return count
