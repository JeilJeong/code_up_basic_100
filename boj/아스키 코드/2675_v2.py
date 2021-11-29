# ref
#   https://ooyoung.tistory.com/69

# v1 64ms > v2 68ms : 내부적으로 동작하는 print 연산 기능이 오히려 성능 저하 원인으로 추정됨

n = int(input())

for _ in range(n):
    cnt, word = input().split()
    for x in word:
        print(x*int(cnt), end="")
    print()