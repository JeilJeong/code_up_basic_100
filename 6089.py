a, r, n = input().split()
i = 1
a = int(a)
r = int(r)
n = int(n)
while (i < n):
	a *= r
	i += 1
print(a)