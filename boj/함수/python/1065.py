num = int(input())
result = 0

for i in range(1, num + 1):
    if (i >= 100):
        before = 0
        after = 0
        count = 0
        for j in range(len(str(i)) - 1):
            after = int(str(i)[j + 1]) - int(str(i)[j])
            if (after == before):
                count += 1
            else:
                if (j != 0):
                    break
                else:
                    count += 1
            before = after
        if (count == (len(str(i)) - 1)):
            result += 1
    else:
        result += 1
print(result)