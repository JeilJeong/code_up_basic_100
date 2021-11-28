# ref
#   https://wook-2124.tistory.com/222

n = int(input())
num = n
cycle = 0

while True:
    a = num // 10
    b = num % 10
    c = (a + b) % 10
    num = (b * 10) + c

    cycle += 1
    if (num == n):
        break

print(cycle)