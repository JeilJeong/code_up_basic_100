h, w = input().split()
h = int(h)
w = int(w)

pad = []
for i in range(h):
	pad.append([])
	for j in range(w):
		pad[i].append(0)

n = int(input())
for i in range(n):
	l, d, x, y = input().split()
	l = int(l)
	d = int(d)
	x = int(x) - 1
	y = int(y) - 1
	for j in range(l):
		if d == 0:
			pad[x][y + j] = 1
		else:
			pad[x + j][y] = 1

for i in range(h):
	for j in range(w):
		print(pad[i][j], end=' ')
	print()
