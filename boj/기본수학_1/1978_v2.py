# ref
#   https://ksw626.tistory.com/87

# 소수 찾기 알고리즘(에라토스네의 체)을 사용한 경우
#   https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4

# 76ms > 메모리 사용량은 소폭 많음 > input 값이 클 때는 space complexity가 증가

import math

num_count = int(input())
num_list = list(map(int, input().split()))
natural_num = list(range(2, 1001)) # 1) 조건에서 1,000 이하의 자연수를 제시, 2) 1은 소수가 아님
count = 0

if len(num_list) == num_count:
    for i in range(2, math.ceil(math.sqrt(1000))): # ex) 범위가 100이라면 10인 경우까지 고려, 만약 16이라면 약수는 1, 2, 4, 8, 16이며, sqrt(n)까지 확인 과정으로 배수 여부를 판별 가능
        for j in natural_num:
            if j / i == 1:
                pass
            elif j % i == 0:
                natural_num.remove(j)
for k in num_list:
    if k in natural_num:
        count += 1
print(count)