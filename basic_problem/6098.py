d = []
for i in range(10):
	d.append([])
	for j in range(10):
		d[i].append(0)

for i in range(10):
	tmp = input().split()
	for j in range(10):
		d[i][j] = int(tmp[j])

flag = 0
y_index = 1
for i in range(1, 10):
	for j in range(y_index, 10):
		if (d[i][j] == 2):
			flag = 1
			d[i][j] = 9
			break
		if (d[i][j + 1] == 1 and d[i + 1][j] == 1):
			flag = 1
			d[i][j] = 9
			break
		elif (d[i][j + 1] == 1 and (d[i + 1][j] == 0 or 2)):
			d[i][j] = 9
			y_index = j
			break
		else:
			d[i][j] = 9
	if flag == 1:
		break

for i in range(10):
	for j in range(10):
		print(d[i][j], end=' ')
	print()