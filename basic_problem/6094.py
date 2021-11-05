n = int(input())
a = input().split()
min = 10001
for i in range(n):
	a[i] = int(a[i])
for i in range(n):
	if (min > a[i]):
		min = a[i]
print(min)