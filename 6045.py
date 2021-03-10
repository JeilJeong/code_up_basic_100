num = input().split()
sum = 0
for i in range(0, len(num)):
	sum = sum + int(num[i])
average = sum / len(num)
print(sum, round(average, 2))