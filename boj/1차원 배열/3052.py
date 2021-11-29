# O(n^2)

li = []
for i in range(10):
    num = int(input()) % 42
    li.append(num)
cnt = [0 for i in range(10)]
for i in range(len(li)):
    for j in range(i + 1, len(li)):
        if (li[i] == li[j]):
            cnt[i] += 1
result = 0
for i in range(len(cnt)):
    if (cnt[i] == 0):
        result += 1
print(result)