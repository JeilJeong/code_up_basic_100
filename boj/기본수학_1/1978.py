# ref
#   https://ksw626.tistory.com/87

# 소수 찾기 알고리즘(에라토스네의 체)을 사용하지 않은 경우

# 76ms

n = int(input())
prime_nums = list(map(int, input().split()))
result = 0

for i in range(n):
    count = 0
    target = prime_nums[i]
    for j in range(1, target + 1):
        if (target % j == 0):
            count += 1
    if (count == 2):
        result += 1
print(result)