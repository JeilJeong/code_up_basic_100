# ref
#   https://ooyoung.tistory.com/81

# Key: 반복문으로 3kg 빼준다는 것이 중요
# 1) 3kg으로 뺼 수 있을만큼 뺀다
# 2) 5kg으로 나누어 떨어지면 몫을 더해 print
# 3) -3kg씩 반복하다 0보다 작으면 -1 출력

sugar = int(input())

bag = 0
while sugar >= 0:
    if sugar % 5 == 0:
        bag += (sugar // 5)
        print(bag)
        break
    sugar -= 3
    bag += 1
else:
    print(-1)