n = int(input())
n_list = list(map(int, input().split()))
max = n_list[0]
min = n_list[0]
for i in n_list:
    if (min > i):
        min = i
    if (max < i):
        max = i
print(min, max, sep=" ")