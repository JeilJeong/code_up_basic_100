# 10,000개의 list 공간을 만듦

def digit_sum(i):
    sum = 0
    while i != 0:
        sum += i % 10
        i //= 10
    return sum

check = [0 for i in range(10000)]

for i in range(1, 10001):
    if (i + digit_sum(i)) <= 10000:
        check[(i + digit_sum(i)) - 1] = 1
for i in range(10000):
    if check[i] == 0:
        print(i + 1)