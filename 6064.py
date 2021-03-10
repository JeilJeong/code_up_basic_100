num = input().split()
for i, n in enumerate(num):
	if(i == 0):
		min = int(n)
		continue
	min = int(n) if min > int(n) else min
print(min)