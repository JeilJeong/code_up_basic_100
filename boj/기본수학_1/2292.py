# 각 서클은 6의 배수로 이루어져 있음
# 1
# 6
# 19 - 8 + 1 = 12
# 37 - 20 + 1 = 18
# 61 - 38 + 1 = 24

n = int(input())
six_sum = 1
i = 1
if (n != 1):
    while True:
        six_sum += 6 * i
        i += 1
        if (n <= six_sum):
            break
print(i)