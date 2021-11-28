# ref
#   https://claude-u.tistory.com/431

# 소수점 아래 자리수를 구하는 과정은 나눗셈 대상의 나머지에 10씩 곱하며 몫을 구하는 과정과 같다

a, b = map(int, input().split())
result = (str(a // b) + ".")
a = (a % b) * 10

for _ in range(1000):
    result += str(a // b)
    a = (a % b) * 10

print(result)