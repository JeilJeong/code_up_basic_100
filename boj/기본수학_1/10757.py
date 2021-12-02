# 직접 풀이를 진행했으며, 테스트 케이스는 통과하지만 틀렸다고 나옴

num1, num2 = input().split()

max_length = 0
max_std = 0
if (len(num1) > len(num2)):
    max_length = len(num1)
    min_length = len(num2)
    max_std = 1
else:
    max_length = len(num2)
    min_length = len(num1)
    max_std = 0
result = [0 for i in range(max_length + 1)]

rev_index = 0
for i in range(1, min_length + 1):
    rev_index = i * -1
    digit = int(num1[rev_index]) + int(num2[rev_index])
    if (digit < 10):
        result[rev_index] += digit
    else:
        result[rev_index] += digit % 10
        result[rev_index - 1] += 1

if (max_std):
    for i in range(max_length - min_length):
        rev_index_after = rev_index - i
        digit = int(num1[rev_index_after]) + result[rev_index_after]
        if (digit < 0):
            result[rev_index_after] += digit
        else:
            result[rev_index_after] += digit % 10
            result[rev_index_after - 1] += 1
else:
    for i in range(max_length - min_length):
        rev_index_after = rev_index - i
        digit = int(num2[rev_index_after]) + result[rev_index_after]
        if (digit < 0):
            result[rev_index_after] += digit
        else:
            result[rev_index_after] += digit % 10
            result[rev_index_after - 1] += 1

start_index = 0
if (result[0] == 0):
    while result[start_index] == 0:
        start_index += 1
for i in range(start_index, len(result)):
    print(result[i], end="")