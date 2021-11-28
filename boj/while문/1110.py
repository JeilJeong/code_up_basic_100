n = input()
n_num = int(n)
if n_num < 10:
    n = "0" + n
cycle = 0
sum = 0
result = -1
while result != n_num:
    sum = int(n[0]) + int(n[1])
    result = int(n[1] + str(sum % 10))
    if (result < 10):
        n = "0" + str(result)
    else:
        n = str(result)
    cycle += 1
print(cycle)