r, g, b = input().split()
t1 = 0
count = 0
while (t1 < int(r)):
	t2 = 0
	while (t2 < int(g)):
		t3 = 0
		while (t3 < int(b)):
			print(t1, t2, t3)
			count += 1
			t3 += 1
		t2 += 1
	t1 += 1
print(count)