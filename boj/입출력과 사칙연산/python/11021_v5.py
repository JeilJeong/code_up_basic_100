cnt = int(input())
for i in range(0, cnt):
    a, b = map(int, input().split())
    index = i + 1
    sum = a + b
    print(f"Case #{index}: {sum}")
