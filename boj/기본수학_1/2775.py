# ref
#   https://elrion018.tistory.com/24

# Key : 반복문을 줄여가는 방법은 없음, list 하나로 각 층을 업뎃하며 정답을 찾아감

# k층의 n호에는 몇 명이 살고 있는가?
# 1) 0층 i호에는 i명
# 2) 1층 i호에는 0층 1호부터 i호까지 합산
# 3) 즉, 바로 아래층의 1~i호까지의 합산 결과를 반환해야 한다
# 4) 0층은 +1씩 증가, 1층은 +1, +2, +3씩, 3층은

T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
    people = [i for i in range(1, n + 1)] # 0층 삽입
    for __ in range(k):
        for j in range(1, n):
            # k층으로 for문을 통해 증가할 때, 각 j번째는 j-1을 접근으로 바로 직전 계산된 같은 층의 이전 호수의 인원 + 업데이트 전 j번째(아래층의 인원수) 인원수 = j번째 업데이트
            people[j] += people[j - 1]
    print(people[-1]) #k층 n번째 호수 인원수는 -1로 뒤에서 접근 가능