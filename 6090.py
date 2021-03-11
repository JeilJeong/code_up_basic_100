a, m, d, n = input().split()
result = int(a)
for i in range(int(n) - 1):
	result = result * int(m) + int(d)
print(result)