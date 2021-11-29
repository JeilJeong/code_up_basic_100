n = input().lower()

alpha = [0 for i in range(0, ord('z') - ord('a') + 1)]
for i in n:
    alpha[ord(i) - ord('a')] += 1
max_val = 0
index = 0
for i in range(len(alpha)):
    if max_val < alpha[i]:
        max_val = alpha[i]
        index = i
rev_max_val = 0
rev_index = 0
for i in range(len(alpha)):
    if rev_max_val <= alpha[i]:
        rev_max_val = alpha[i]
        rev_index = i
if rev_index != index:
    print("?")
else:
    print(chr(ord('A') + index))