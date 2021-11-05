d = []
for i in range(19):
	d.append([])
	for j in range(19):
		d[i].append(0)

for i in range(19):
	tmp = input().split()
	for j in range(19):
		d[i][j] = int(tmp[j])

n = int(input())
for k in range(n):
	x, y = input().split()
	x = int(x) - 1
	y = int(y) - 1
	for i in range(19):
		if (d[i][y] == 0):
			d[i][y] = 1
		else:
			d[i][y] = 0
		if (d[x][i] == 0):
			d[x][i] = 1
		else:
			d[x][i] = 0

for i in range(19):
	for j in range(19):
		print(d[i][j], end=' ')
	print()