# v1 68ms > v2 68ms 동일

n = int(input())
num = int(input())

sum = 0
for i in range(n):
    sum += num % 10
    num //= 10
print(sum)
