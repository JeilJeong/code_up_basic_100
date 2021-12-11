n = int(input())
li = list(map(int, input().split()))
div = max(li)
result = [0 for i in range(n)]
for index, value in enumerate(li):
    result[index] = (value / div) * 100
print(sum(result) / n)