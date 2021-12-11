# fail

n = [input() for i in range(9)]
max = int(n[0])
n_index = 0
for index, i in enumerate(n):
    if (max < int(i)):
        max = int(i)
        n_index = index + 1
print(max)
print(n_index)