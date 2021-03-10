num = int(input())
even_sum = 0
for i in range(num + 1):
	if (i % 2 == 0):
		even_sum += i
print(even_sum)