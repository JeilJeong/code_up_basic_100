n = int(input())
li = [input() for i in range(n)]
count = [0 for i in range(n)]
for i in range(n):
    arr = list(map(int, li[i].split()))
    average = (sum(arr) - arr[0]) / arr[0]
    for j in range(1, len(arr)):
        if (arr[j] > average):
            count[i] += 1
    print("%.3f%%"%((count[i] / arr[0]) * 100))