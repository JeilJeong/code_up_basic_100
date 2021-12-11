# ref
#   https://jobc.tistory.com/141

a = int(input())
b = int(input())
c = int(input())
mul = a * b * c
li = [0 for i in range(10)]
while mul != 0:
    li[int(mul % 10)] += 1
    mul //= 10
for i in li:
    print(i)