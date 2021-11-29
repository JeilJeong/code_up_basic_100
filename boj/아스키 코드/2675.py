n = int(input())
for i in range(n):
    li = list(input().split())
    for j in li[1]:
        for k in range(int(li[0])):
            print(j, end="")
    print()