n = int(input())
tmp = 0
while (tmp <= n):
	if (tmp % 3 == 0):
		tmp += 1
		continue
	print(tmp)
	tmp += 1