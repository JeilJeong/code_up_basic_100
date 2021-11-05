a, b = input().split()
for i in range(int(a) + 1):
	if (i == 0):
		continue
	for j in range(int(b) + 1):
		if (j == 0):
			continue
		print(i, j)