n = int(input())
a = input().split()
reverse_a = []
for i in range(n):
	reverse_a.append(0)
for i in range(n):
	reverse_a[i] = a[(n - 1) - i]
for i in range(n):
	print(reverse_a[i], end=' ')