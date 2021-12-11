code = input()
li = [-1 for i in range(0, ord('z') - ord('a') + 1)]

loc = 0
for i in code:
    if (li[ord(i) - ord('a')]) == -1:
        li[ord(i) - ord('a')] = loc
    loc += 1
for i in li:
    print(i, end=" ")