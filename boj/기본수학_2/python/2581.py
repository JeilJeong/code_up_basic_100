# ref
#   https://ooyoung.tistory.com/93

# 기존 풀이의 경우 중간 break 없이 진행했기에 시간이 오래 걸림 > 하단 [핵심] 개선 후 652ms

# Key: 이전 문제에서 에라토스네의 체를 이용한 방법은 공간 복잡도가 매우 나쁘며, 시간 복잡도 성능상의 차이를 보이지 못했다.
# sqrt를 이용해 최소한의 약수를 찾는 것은 어떨까?

import math

m = int(input())
n = int(input())

result = []
for i in range(m, n + 1):
    count = 0
    if i > 1:
        for j in range(2, i):
            if (i % j == 0):
                count += 1
                break # 핵심: range를 2부터 설정해서 i-1까지 약수가 존재하면 중간에 끊어준다
        if (count == 0):
            result.append(i)
if (len(result) > 0):
    print(sum(result))
    print(min(result))
else:
    print(-1)