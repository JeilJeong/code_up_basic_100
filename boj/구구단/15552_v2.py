# ref
#   https://codesyun.tistory.com/178?category=1035147#--%--%ED%--%-C%--%EA%B-%-C%EC%-D%--%--%EC%A-%--%EC%--%--%EB%A-%BC%--%EC%-E%--%EB%A-%A-%--%EB%B-%-B%EC%-D%--%--%EB%--%-C

import sys

n = int(input())
for i in range(n):
    a,b = map(int, sys.stdin.readline().split())
    print(a + b)