# 규칙
# 1) n번째 손님을 H로 나눈 나머지를 구한다
# 2) if 나머지가 0이라면, 몫을 그대로 사용, 아니라면 +1을 해서 사용한다.
# 3) 몫은 곧 YYXX 형태의 XX의 위치를 나타낸다.
# 4) YY는 나머지가 0이라면 최고층 H와 동일하고, 아니라면 나머지가 YY로 결정된다

n = int(input())
for i in range(n):
    h, w, n = map(int, input().split())

    remain = n % h
    xx = n // h
    if (remain != 0):
        xx += 1
        print(remain, end="")
        print("{0:02d}".format(xx))
    else:
        print(h, end="")
        print("{0:02d}".format(xx))
