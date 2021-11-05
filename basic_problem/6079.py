n = int(input())
e = 1
sum = 0
while (True):
	sum += e
	if (sum >= n):
		break
	e += 1
print(e)