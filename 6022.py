s=input()
for i in range(0, len(s)):
	print(s[i],end='')
	if (i % 2 == 1):
		print(' ',end='')