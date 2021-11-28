cnt = int(input())
for i in range(0, cnt):
    a, b = map(int, input().split())
    print("Case #{index}: {sum}".format(index=i+1, sum=a+b))
